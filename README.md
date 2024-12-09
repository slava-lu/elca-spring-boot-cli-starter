# Elca Spring Boot Starter Project
## Description

The ELCA Spring Boot Starter Project provides the initial boilerplate and a collection of pre-configured Spring Boot boilerplates
to help you quickly bootstrap new applications or add functionality to existing ones using the Spring CLI.

## Available projects

1. **ecla-starter**. Contains essential dependencies that are useful in every project.
2. **ecla-web**. Includes dependencies for building a REST API server.
3. **ecla-jpa**. Includes dependencies for Java Persistence API.
4. **ecla-ddd**. Starter DDD project.

## Prerequisites
* Java Development Kit (JDK) 21 or higher. [Installation instruction](https://www.oracle.com/java/technologies/downloads/)
* Spring CLI installed on your system. [Installation instruction](https://docs.spring.io/spring-cli/reference/installation.html)


### How to use

* Ensure that the Spring CLI is installed and available in your system's PATH: `spring version`
* Add the ELCA catalog to the Spring CLI by running: `spring project-catalog add elca https://github.com/slava-lu/elca-spring-boot-cli-catalog`,
  Here, _elca_ is an arbitrary name you assign to the catalog.
* Check that the catalog has been registered properly: `spring project-catalog list`. You should see the catalog with the name _elca_ in the output.
* To see the projects available in the Spring CLI, run: `spring project list`. You may also see a number of default projects that come with the Spring CLI.
* Create a new project using the **elca-starter** project first: `spring boot new my-app elca-starter`. This command will create a new project in the _my-app_ directory.
* Navigate to your project directory: `cd my-app`. Add additional features by merging other projects from the catalog.
  For example, to add REST API server capabilities: `spring boot add elca-web`.

if you want to create a new project with custom metadata, you can use additional options in `spring boot new` command, like this:
```
spring boot new my-app elca-starter 
  --group-id ch.elca 
  --artifact-id my-new-project 
  --version 1.0.0 
  --description "A sample Spring project" 
  --package-name com.example.mynewproject
```

## Elca techniques

### Null-safety annotations
Using Default Nullability Annotations allows us to declare that all types within a package are non-null
by default unless explicitly annotated as nullable, significantly reducing the likelihood of null pointer exceptions.
This practice enforces consistent nullability across the codebase, enhancing code safety, readability,
and aiding static analysis tools in detecting potential nullability issues. [Read more](https://confluence.svc.elca.ch/display/CCJAVA/Null-safety+annotations+with+spring+and+lombok)

### Unit testing: guidelines for naming
Naming-Convention for unit test classes: <class-to-be-tested>Test

Test methods should follow a consistent naming pattern across the project.
The naming pattern should help to identify the following aspects:

* which method / feature is tested?
* what is the scenario, in which this method / feature is tested?
* what is the expected result?

You can see the example in elca-jpa project. [Read more](https://confluence.svc.elca.ch/display/CCJAVA/Unit+testing%3A+guidelines+for+naming%2C+structure+and+documentation)

### Other Elca techniques
* To learn more about ELCA techniques, visit  https://confluence.svc.elca.ch/display/CCJAVA/ELCA+techniques

## Additional info
* To learn more about the Spring CLI tool, visit https://docs.spring.io/spring-cli/reference/index.html
* This template is maintained by [Java CC](https://confluence.svc.elca.ch/display/CCJAVA)