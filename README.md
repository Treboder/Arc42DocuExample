[![Build Maven Project](https://github.com/Treboder/Arc42DocuExample/actions/workflows/maven-build.yml/badge.svg)](https://github.com/Treboder/Arc42DocuExample/actions/workflows/maven-build.yml)
![pages-build-deployment](https://github.com/Treboder/Arc42DocuExample/actions/workflows/pages/pages-build-deployment/badge.svg)

# Arc42 Docu Example

This project demonstrates how to provide a [arc42](https://arc42.org/) system documentation via [Asciidoctor](https://asciidoctor.org/)    
for an exemplary [Spring Boot](https://spring.io/guides/gs/spring-boot/) application.
The app basically consists of a single controller exposing the endpoint [http://localhost:8080/hello](http://localhost:8080/hello) with a welcome message only, 
but also delivers the docu via [http://localhost:8080/docs/index.html](http://localhost:8080/docs/index.html).
We also deploy the docu to [Github Pages](https://pages.github.com/). 

The documentation is maintained as [asciidoc](https://asciidoc.org/) with *.adoc files.
Those files reside in [src/main/doc/](src/main/doc/).
Maven-command ````mvn package verify````creates static html from asciidoc first (package phase) with the generated HTMLs placed in [docs](docs/) as the result. 
The Maven build also copies the files to [src/main/resources/static/](src/main/resources/static/) (verify phase) in order to be used from the running application.
Github Pages also deploys the static HTML files to [https://treboder.github.io/Arc42DocuExample/](https://treboder.github.io/Arc42DocuExample/)

### Reference Documentation
For further reference, please consider the following sections:

* [Arc42 Templates](https://github.com/arc42/arc42-template)
* [Arc42 Examples](https://arc42.org/examples)
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

