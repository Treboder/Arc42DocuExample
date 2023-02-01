# Getting Started

![pages-build-deployment](https://github.com/Treboder/Arc42DocuExample/actions/workflows/pages/pages-build-deployment/badge.svg)

This project demonstrates how to provide a [arc42](https://arc42.org/) system documentation via [Asciidoctor](https://asciidoctor.org/)    
for an exemplary [Spring Boot](https://spring.io/guides/gs/spring-boot/) application.
The app basically consists of a single controller exposing the endpoint :8080/hello with a welcome message only, 
but also delivers the docu via [http://localhost:8080/docs/index.html](http://localhost:8080/docs/index.html).
We also deploy the docu to [Github Pages](https://pages.github.com/). 

The documentation is maintained as [asciidoc](https://asciidoc.org/) with *.adoc files.  
'mvn package verify' creates static html from asciidoc first (package phase), then copies the files to classpath (verify phase).
Github Pages finally deploys the static html to [https://treboder.github.io/Arc42DocuExample/](https://treboder.github.io/Arc42DocuExample/)

### Reference Documentation
For further reference, please consider the following sections:

* [maven lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
* [how-can-i-serve-static-html-from-spring-boot](https://stackoverflow.com/questions/42393211/how-can-i-serve-static-html-from-spring-boot)
* [maven-copy-files](https://www.baeldung.com/maven-copy-files)
* [creating-a-github-pages-site](https://docs.github.com/de/pages/getting-started-with-github-pages/creating-a-github-pages-site)
* [Asciidoctor](https://asciidoctor.org/)
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

