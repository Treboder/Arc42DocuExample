# Getting Started

This is an attempt to use [Asciidoctor](https://asciidoctor.org/) 
together with [Thymeleaf](https://www.thymeleaf.org/) 
in order to deploy a system documentation structured as [arc42](https://arc42.org/)
along with an exemplary [Spring Boot](https://spring.io/guides/gs/spring-boot/) application.  

The idea to deploy the app together with its documentation is based on:
* documentation is maintained as ascidoc  
* 'mvn package' will create html from ascidoc, and copy files to resources/templates
* Thymeleaf delivers html-type documentation via [http://localhost:8080/doc](http://localhost:8080/doc)

### Next step (and the reason why this approach didnt work so far)
... would be to get images to be rendered, which is currently not the case.  

### Reference Documentation
For further reference, please consider the following sections:

* [Asciidoctor](https://asciidoctor.org/)
* [Thymeleaf](https://www.thymeleaf.org/)
* [arc42](https://arc42.org/) 
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

