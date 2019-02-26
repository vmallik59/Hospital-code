pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        
    }
	post {
                success {
                    junit keepLongStdio: true, testResults: '**/*-reports/*.xml'
                }
            }
	
}
