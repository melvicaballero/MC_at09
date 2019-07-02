pipeline {
    agent any
    stages {
        stage('Assemble') {
	    steps {
	        echo 'Building.'
		bat 'quickstart\gradlew assemble -p quickstart'
	    }
        }
        stage('Unit Test') {
	    steps {
	        echo 'Execute Unit Test.'				
	    }
        }
	stage('Deploy') {
	    steps {
	        echo 'Deploying.'
	    }
        }
    }
}	
