package com.pnk.githubjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubJenkinsDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubJenkinsDockerApplication.class, args);
    }


    public static void message() {
        System.out.println("Hello from Github-Jenkins-Docker project!!!");
    }

}
