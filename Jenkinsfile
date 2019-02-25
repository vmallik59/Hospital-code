pipeline {
    agent { docker "java" }
    stages {
        stage("build") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post {
        success {
            junit '**/*.xml'
        }
    }
    
}
