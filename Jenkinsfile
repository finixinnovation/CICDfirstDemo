pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3' // Define the Maven version to use
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/finixinnovation/CICDfirstDemo.git' 
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // If using Maven
                    sh 'mvn clean install'
                    
                    // If using Gradle
                    // sh './gradlew build'
                }
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Deployment steps here, could be copying files to a server, using Docker, etc.
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}