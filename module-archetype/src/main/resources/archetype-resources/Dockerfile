FROM openjdk:8-jre-alpine

ARG JAR_FILE=${artifactId}-${version}.jar

RUN echo ${JAR_FILE}

RUN mkdir -p /app

ADD target/${JAR_FILE} /app/

#应用需要暴露的端口
EXPOSE 18081

WORKDIR /app

CMD ["java", "-jar" ,"${artifactId}-${version}.jar"]