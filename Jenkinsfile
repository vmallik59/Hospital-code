pipeline {
agent any
 
tools{
	maven 'maven 3'
	java 'java 8'
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
