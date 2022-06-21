FROM tomcat:9.0.59-jdk11-openjdk

LABEL maintainer="kkalnins@eisgroup.com"

COPY ./web-app.war /usr/local/tomcat9/webapps

EXPOSE 8080

CMD ["catalina.sh","run"]
