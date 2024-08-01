FROM openjdk:8u131-jdk-alpine
EXPOSE 9091
COPY ./target/Product.jar Product.jar
ENTRYPOINT ["java","-jar","/Product.jar"]