# Build and Push Docker Image using Jenkins Pipeline
![Jenkins and Docker](https://user-images.githubusercontent.com/116586798/234900411-d76b40b8-5fb0-4698-85d0-3092ae0cd208.png)
This Jenkins pipeline automates the build, test, and deployment process of a Java application using Maven and Docker. The pipeline is divided into three stages, as follows:
1. Build Maven: This stage checks out the source code from the GitHub repository, then builds and tests the Spring Boot application using Maven. The mvn clean install command is executed to compile the code, run tests, and package the application.

2. Build Docker image: In this stage, the pipeline builds a Docker image for the Java application. The Dockerfile in the project root defines the base image, the application's JAR file, and other configurations. The image is tagged with the format username/repository_name.

Push image to Docker Hub: The final stage logs in to Docker Hub using the stored credentials and pushes the Docker image to the specified repository. This allows the image to be easily deployed to various environments or shared with other team members.

To implement this pipeline, you need to have Jenkins installed and configured with the required plugins, such as the Docker and Maven integrations. Additionally, you must store your Docker Hub credentials securely in Jenkins to be used within the pipeline.
