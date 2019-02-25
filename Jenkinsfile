pipeline {
    agent { docker "java" }
    stages {
        stage("build") {
            steps {
                sh 'mvn clean install -Dmaven.test.failure.ignore=true'
            }
        }
    }
    post {
        success {
            junit '**/*.xml'
        }
    }
}
