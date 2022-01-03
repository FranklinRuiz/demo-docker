FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./demo*.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]