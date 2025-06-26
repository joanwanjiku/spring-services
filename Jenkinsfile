pipeline {
    agent {
        node {
            label 'docker-agent-alpine'
        } 
    }
    tools {
        // Define the tools required for the pipeline
        maven 'maven'  // Ensure Maven is installed on the agent
    }
    environment {
        REGISTRY_URL = 'docker.io'
        IMAGE_NAME = 'joan18ndambiri/ms-spring-overview'
        IMAGE_TAG = "v${BUILD_ID}"
        DOCKER_CREDENTIALS_ID = 'dockerhub'  // Jenkins credential ID
        DOCKERFILE_DIR = 'ms-spring-overview'  // Directory containing the Dockerfile
    }
    stages {
        stage('Build spring boot app') {
            steps {
                sh 'ls -la && find . -name pom.xml'

                dir("${DOCKERFILE_DIR}") {
                    echo "Building Spring Boot app in directory: ${DOCKERFILE_DIR}"
                    sh 'mvn clean package -DskipTests'
                }
            }
        }
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker Image....' 
                script {
                    app = docker.build("${IMAGE_NAME}:${IMAGE_TAG}", "-f ${DOCKERFILE_DIR}/Dockerfile .")
                    env.IMAGE = "${IMAGE_NAME}:${IMAGE_TAG}"
                    echo "Docker image built: ${env.IMAGE}"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                echo 'Pushing Docker Image....' 
                script {
                    def registry = "https://${REGISTRY_URL}"
                    def credentialsId = DOCKER_CREDENTIALS_ID

                    docker.withRegistry(registry, credentialsId) {
                        app.push()
                    }
                    echo "Docker image pushed: ${fullTag}"
                }
            }
        }
    }
    post {
        always {
            echo 'Cleaning up...'
            
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}









