pipeline {
    agent any
    
    stages {
        

        stage ('Build') {
            
            post {
                success {
                    junit '**/*.xml' 
                }
            }
        }
    }
}
