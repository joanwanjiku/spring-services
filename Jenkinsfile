pipeline {
    agent {
        node {
            label 'docker-agent-alpine'
        } 
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building....' 
                sh '''
                echo "doing build stuff"
                '''
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....' 
                sh '''
                echo "doing test stuff"
                '''
            }
        }
        stage('Production') {
            steps {
                echo 'deploying....' 
                sh '''
                echo "doing production stuff"
                '''
            }
        }
    }
}