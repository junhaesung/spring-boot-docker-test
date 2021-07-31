FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
EXPOSE 8080

# tzdata for timzone
RUN apt-get update -y
RUN apt-get install -y tzdata
# timezone env with default
ENV TZ Asia/Seoul

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]