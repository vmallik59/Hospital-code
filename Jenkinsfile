pipeline {
    agent { docker "java" }
    stages {
        stage("build") {
            steps {
                sh 'clean install'
            }
        }
    }
    post {
        success {
            junit '**/*.xml'
        }
    }
    
}
