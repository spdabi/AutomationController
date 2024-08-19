FROM eclipse-temurin:17
COPY target/autobuild.jar autobuild.jar
CMD ["java","-jar","autobuild.jar"]