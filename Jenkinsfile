pipeline {
agent any
 
tools{
	Maven 'maven 3'
	Java 'java 8'
}
 
stages {
	stage ("initialize") {
		steps {
			sh '''
			echo "PATH = ${PATH}"
			echo "M2_HOME = ${M2_HOME}"
			'''
		}
	}
}
}
