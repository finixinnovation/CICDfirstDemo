pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-11' // Set this to your JDK path
        PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/finixinnovation/CICDfirstDemo.git'
            }
        }
        
        stage('Build') {
            steps {
                // Build the Spring Boot application using Maven
                bat 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                // Run unit tests
                bat 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Deploy the application
                bat 'java -jar target\\CICDdemo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
    
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
