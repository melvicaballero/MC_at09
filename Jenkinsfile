pipeline {
    agent any    
    stages {
        stage('Assemble') {
	    steps {
		echo 'Building.'
		sh 'chmod +x quickstart/gradlew'    
		sh './quickstart/gradlew assemble -p quickstart'
	    }
	}	
    
        stage('Unit Test') {
	    parallel {
	        stage('test1') {
	            steps {
	                echo 'Execute Test1.'	
		        sh './quickstart/gradlew test -p quickstart'
		    }	
	        }
		stage('test2') {
		    steps {
		        echo 'Execute Test2.'
			sh './quickstart/gradlew test -p quickstart'
		    }
                }					
            }
	}	
	stage('Deploy') {
            steps {
		echo 'Deploying.'
	    }
        }
    }	    
}
