pipeline {
    agent any    
    }
    stages {
        stage('Assemble') {
	    steps {
	        echo 'Building.'
		sh 'chmod +x quickstart'    
		sh './quickstart/gradlew assemble -p quickstart'
	    }
        }
        stage('Unit Test') {
	    steps {
	        echo 'Execute Unit Test.'	
		sh './quickstart/gradlew test -p quickstart'
	    }
        }
	stage('Deploy') {
	    steps {
	        echo 'Deploying.'
	    }
        }
    }   
}	
