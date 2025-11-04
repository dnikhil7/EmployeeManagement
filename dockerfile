# Use Tomcat 10 since you are on Jakarta Servlet 6
FROM tomcat:10.1-jdk17-temurin

# Remove default webapps (optional, keeps container clean)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR as ROOT.war so it runs at http://localhost:8080/
COPY target/EmployeeManagement-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
