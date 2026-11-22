pipeline {

    agent {
        label 'maven-java21'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Check Java') {
            steps {
                container('maven') {
                    sh 'java -version'
                    sh 'mvn -version'
                }
            }
        }

        stage('Build') {
            steps {
                container('maven') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                container('maven') {
                    sh 'mvn test'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed'
        }
    }
}