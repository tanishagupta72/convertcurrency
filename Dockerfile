FROM adoptopenjdk:11-jre-hotspot-bionic
ADD target/convertcurrency-0.0.1-SNAPSHOT.jar convertcurrency.jar
EXPOSE 9000
ENTRYPOINT [ "java", "-jar" , "convertcurrency.jar"]
