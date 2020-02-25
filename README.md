# Getting Started
# Spring Boot Microservice - Movie Info Service app
### This project developed using the following Spring boot, Microservice, Spring Cloud, Spring JPA, H2 Database. 
* **Spring Cloud Netflix Eureka Client** is used to register the movie-catalog-service to the discovery server
* By using the **discovery server**, we can avoid hardcoding the value of localhost and port no in the code. By using **RestTemplate**, each microservice app endpoint is executed
* **Spring Cloud Netflix Hystrix** is used to view the rest endpoint call monitor in hystrix dashboard
* **Spring cloud starter config** used to config the microservice specific app properties or yml file in git hub
* Used the **H2 database** for the following tables movie info and movie rating. Just for illustration purpose

# Prerequisite  
Please follow the details before you start downloading the project.  
### Readme:  
[https://github.com/rajs24/sbt-ms-movie-catalog/blob/master/README.md](https://github.com/rajs24/sbt-ms-movie-catalog/blob/master/README.md)


# Download Spring Movie Info Service Project
Clone the **movie info service** project  
Git Clone: [https://github.com/rajs24/sbt-ms-movie-info.git](https://github.com/rajs24/sbt-ms-movie-info.git)  

# Start the Server
Start the **movie info service** project

# Endpoint Details
GET  
H2 db as pre-defined insert datasets for movie info  
`/movies/{movieId}` 

Sample:  
`movies/1`  
`movies/2`  
`movies/3`  
```
http://localhost:8082/movies/1
```
GET  
get all movie details from db   
```
http://localhost:8082/movies/all
```
H2 Console
```
http://localhost:8081/h2
```
Movie info service specific yml files in the git repository
```
http://localhost:8085/movie-info-service/default
```
