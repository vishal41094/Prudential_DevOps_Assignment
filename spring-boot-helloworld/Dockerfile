# Stage 1
# the first stage of our build will use a maven 3.6.1 parent image
FROM maven:3.6.1-jdk-8-alpine AS MAVEN_BUILD

# copy the pom and src code to the container
COPY ./ ./

# package our application code
RUN mvn clean package


# Stage 2
# the second stage of our build will use open jdk 8 on alpine 3.9
FROM openjdk:8-jre-alpine3.9

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=MAVEN_BUILD /docker-spring-boot-hello-world/target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar /spring-boot-hello-world-0.0.1-SNAPSHOT.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/spring-boot-hello-world-0.0.1-SNAPSHOT.jar"]