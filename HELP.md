# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.pnk.github-jenkins-docker' is invalid and this project uses 'com.pnk.githubjenkinsdocker' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### References
* Building Docker Images using Jenkins step by step | Devops Integration Live Demo | JavaTechie
  https://www.youtube.com/watch?v=mszE-OCI2V4

### Executing Steps
* Whenever a change was made in the master branch (a PR merged or a direct commit), go ahead to check in the Jenkins server @ http://localhost:8080/job/github-jenkins-docker-integration/
* If the test in Jenkins is passing, then the image of "github-jenkins-docker-integration" is successfully created in Jenkins.
* Open the PowerShell (run as Administrator if needed), run the commands below in the Executing Command Lines section.

### Executing Command Lines
```shell
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

PS C:\Windows\system32> docker pull phongvo0222/docker-jenkins-integration-sample:latest
	latest: Pulling from phongvo0222/docker-jenkins-integration-sample
	Digest: sha256:6d5d72aa4b428e250a5aecdafc7a576fccbe8ef09418d6bc9d3627762bdb914d
	Status: Image is up to date for phongvo0222/docker-jenkins-integration-sample:latest
	docker.io/phongvo0222/docker-jenkins-integration-sample:latest

	What's Next?
	  View a summary of image vulnerabilities and recommendations → docker scout quickview phongvo0222/docker-jenkins-integration-sample:latest
PS C:\Windows\system32> docker ls
	docker: 'ls' is not a docker command.
	See 'docker --help'
PS C:\Windows\system32> docker image ls
	REPOSITORY                                      TAG       IMAGE ID       CREATED          SIZE
	phongvo0222/docker-jenkins-integration-sample   latest    2b5df2d99cfe   12 minutes ago   524MB
	phongvo0222/docker-jenkins-integration-sample   <none>    d85c9ae4ea1d   17 minutes ago   524MB
PS C:\Windows\system32> docker run -p 8081:8080 phongvo0222/docker-jenkins-integration-sample

	  .   ____          _            __ _ _
	 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
	( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
	 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
	  '  |____| .__|_| |_|_| |_\__, | / / / /
	 =========|_|==============|___/=/_/_/_/
	 :: Spring Boot ::                (v3.2.1)

	2024-01-12T01:16:53.735Z  INFO 1 --- [           main] c.p.g.GithubJenkinsDockerApplication     : Starting GithubJenkinsDockerApplication using Java 21 with PID 1 (/docker-jenkins-integration-sample.jar started by root in /)
	2024-01-12T01:16:53.753Z  INFO 1 --- [           main] c.p.g.GithubJenkinsDockerApplication     : No active profile set, falling back to 1 default profile: "default"
	2024-01-12T01:16:56.937Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
	2024-01-12T01:16:56.994Z  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
	2024-01-12T01:16:56.995Z  INFO 1 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.17]
	2024-01-12T01:16:57.153Z  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
	2024-01-12T01:16:57.166Z  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3121 ms
	2024-01-12T01:16:58.408Z  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
	2024-01-12T01:16:58.436Z  INFO 1 --- [           main] c.p.g.GithubJenkinsDockerApplication     : Started GithubJenkinsDockerApplication in 6.58 seconds (process running for 7.926)
	2024-01-12T01:17:03.483Z  INFO 1 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
	2024-01-12T01:17:03.483Z  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
	2024-01-12T01:17:03.485Z  INFO 1 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
	Welcome to Github-Jenkins-Docker project!!!
	Testing if a PR merged to master would trigger Jenkins!?
PS C:\Windows\system32>
```
