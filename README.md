# Devtools Demo

A Spring Boot application used to demonstrate how [_Automatic Restart_](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.devtools.restart 'Automatic Restart') and [_LiveReload_](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.devtools.livereload 'Live Reload') are enabled in Spring Boot with [developer tools](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using.devtools 'Developer Tools').

## Description

This project can be used to follow along with a guide from my blog titled: *Spring Devtools: Automatic Restart & LiveReload*. It details how developer tools are added to a Spring Boot project and how to enable *Automatic Restart* and *LiveReload*. The guide can be found here: [passingarguments.dev/spring-devtools](https://www.passingarguments.dev/posts/hello-world/ "passingarguments.dev")

## Getting Started

Follow these steps to compile and run the application:
1. Clone the project.

```agsl
git clone git@github.com:bunny-thief/devtools-demo.git
```
2. `cd` into the project directory.

```agsl
cd devtools-demo
```
3. Run the application with the following command:

```agsl
mvn spring-boot:run
```

### Dependencies

This application was compiled with Eclipse Temurin 17.0.8, Spring Framework 6.1.3 and Spring Boot 3.2.2. 


## API Endpoint

This API endpoint is used to demonstrate how a change made in the application code causes an automatic restart in IntelliJ.

### GET

`/api/date` - Returns the current date in the following format "**YYYY-MM-DD**".

## Author

![](Mastodon_logo.png) [@bunnythief@hachyderm.io](https://hachyderm.io/@bunnythief)

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.