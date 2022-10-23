FROM maven:latest AS appserver
WORKDIR /usr/src/
COPY pom.xml .
RUN mvn -B -f pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve
COPY . .
RUN mvn -B -s /usr/share/maven/ref/settings-docker.xml package -DskipTests


FROM eclipse-temurin:17-jdk-alpine 
#RUN adduser -Dh /home/gordon gordon
#WORKDIR /static
#COPY --from=storefront /usr/src/atsea/app/react-app/build/ .
WORKDIR /app
COPY --from=appserver /usr/src/target/evona-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "/app/evona-0.0.1-SNAPSHOT.jar"]

#CMD ["--spring.profiles.active=postgres"]