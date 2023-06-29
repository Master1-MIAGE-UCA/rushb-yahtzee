FROM openjdk:17
LABEL authors="Jarod ACLOQUE, Remy BENALOUANE, Lilian PETIT, Hugo RULLIERE"

#RUN a new app directory
RUN mkdir /app

#Set the working directory to /app
WORKDIR /app

#Copy the app files from host machine to image file system
COPY target/yahtzee-0.0.1-SNAPSHOT.jar /app/yahtzee.jar

#Run the Main class
CMD ["java", "-jar", "/app/yahtzee.jar"]

# BUILD image : docker build -t yahtzee:1.0 .
# RUN image : docker run -it --name yahtzee:1.0