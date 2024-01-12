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
    public static String message() {
        System.out.println("Welcome to Github-Jenkins-Docker project!!!");
        System.out.println("Testing if a PR merged to master would trigger Jenkins!?");
        System.out.println("Confirmed PR merged to master successfully triggers Jenkins! Yay!!");

        return "Hello from Github-Jenkins-Docker project! Confirmed PR merged to master successfully triggers Jenkins! Yay!!";
    }

}
