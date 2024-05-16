package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class GitdemoApplication {

    public static void main(String[] args) {
//        
//        SpringApplication.run(GitdemoApplication.class, args);
        System.out.println("Hello World");

        car c1=new car("a",1);
        car c2=new car("b",2);
        car[] arr=new car[2];
        arr[0]=c1;
        arr[1]=c2;

        Arrays.sort(arr,new comparator());
    }

}
