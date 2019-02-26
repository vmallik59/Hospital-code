node {
        stage('Building WAR...') {
            withMaven(maven: 'Maven 3.5.0') {
                // Run the maven build
                sh 'mvn clean install' //Same as running on local
             }
        }
}
