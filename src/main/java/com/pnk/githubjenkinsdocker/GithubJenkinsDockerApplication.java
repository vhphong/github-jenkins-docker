package com.pnk.githubjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/github-jenkins-docker")
public class GithubJenkinsDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubJenkinsDockerApplication.class, args);
    }


    @GetMapping("/message")
    public static void message() {
        System.out.println("Hello from Github-Jenkins-Docker project!!!");
    }

}
