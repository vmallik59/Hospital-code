pipeline {
    agent { docker "java" }
    stages {
        stage("build") {
            steps {
                echo 'Testing'
            }
        }
    }
    post {
        success {
            junit '**/*.xml'
        }
    }
    
}
