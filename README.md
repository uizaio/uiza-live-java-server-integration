# UIZA


Technologies: Java, Spring Boot
Server: Embedded Tomcat (port 8080)

##How To Run Java App
- Go To Project Directory
- Run `mvn clean install` command
- Go To target folder in the project
- Run `java -jar demo-0.0.1-SNAPSHOT.jar`
- After successfully execution of above step. Application will run on 8080 port.

## How To change UIZA url
- Go To Project directory
- Go To /src/main/resources folder
- Open application.properies file.
- In application.properties file we have defined url and token.

Simple step for create rest endpoint.
- Create Simple java LiveEntityResource.java
- Annotate LiveEntityResource.java with @RestController
- Add request mapping @RequestMapping("/app/live/entities"). Client application use this mapping URL to call rest endpoint.
- Add Method for retrive, create, update or delete live entity.
    For Retrive - Use @GetMapping
    For Create - Use @PostMapping
    For Update - Use @PutMapping
    For Delete - Use @DeleteMapping
- Add appropriate logic inside newly created method.
