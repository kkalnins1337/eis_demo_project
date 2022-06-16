# eis_demo_project
Simple spring boot web application for testing with some issues in a code

Tools will be required for that project:
1. Git client
2. Apache maven 3.6.3
3. Adopt open jdk (temurin) version 11.0.12 or later
4. Apache Tomcat 9.0.59

The Process of using project:
1. Clone the repository
2. In a root path lauch the maven command: "mvn clean install" -  it should compile the code and you should get success result, after that the war file will be located in a target dir and named "web-app.war"
3. While executing the code you will get some compilation errors - please try to solve it.
4. After the compilation is success - deploy it on tomcat: hint: Copy web-app.war to tomcat/webapps and launch the tomcat.
5. Test if application is working: got to url: http://localhost:8080/web-app/Test
