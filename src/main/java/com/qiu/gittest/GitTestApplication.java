package com.qiu.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("hello git");
        System.out.println("hello git2");
        System.out.println("hello git3");
        System.out.println("master");
        System.out.println("hot-fix");
        System.out.println("push test");
        System.out.println("pull test");
    }

}
