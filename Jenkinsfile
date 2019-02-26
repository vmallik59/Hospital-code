node('jenkins-agent-maven-39') {
    stage('Start') {
        switch (env.BRANCH_NAME) {
            case 'master':
                devFlow()
                break
            default:
                echo 'Assuming development flow'
                devFlow()
                break
        }
    }
}

def devFlow() {
    echo 'Starting development flow'

    stage('Configure build') {
        def pom = readMavenPom file: 'pom.xml'
        version = pom.version
        buildVersion = "${version}.${env.BUILD_NUMBER}"
        currentBuild.displayName = "${buildVersion}"
    }

    stage('Build stage') {
        sh 'mvn -B package'
    }

    stage('Test stage') {
        try {
            sh 'mvn -B verify'

        } catch (err) {
            if (currentBuild.result == 'UNSTABLE')
                currentBuild.result = 'FAILURE'
            throw err
        } finally {
            sh 'find .'
            junit keepLongStdio: true, testResults: '**/target/*-reports/*.xml'
            //junit keepLongStdio: true, testResults: '**/target/surefire-reports/*.xml'
        }
    }
}
