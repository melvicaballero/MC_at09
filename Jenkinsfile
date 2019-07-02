pipeline {
    agent any
    /*triggers { 
        cron('H/15 * * * *')*/ 
    }
    stages {
        stage('Assemble') {
	    steps {
	        echo 'Building.'
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
    /*post {
        always {
            echo 'One way or another, I have finished'
            /* deleteDir() /* clean up our workspace */
        /*}
        success {
            echo 'I succeeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
	     mail to: 'melvi.caballero@gmail.com',
                  subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
                  body: "Something is wrong with ${env.BUILD_URL}"
        }
        changed {
            echo 'Things were different before...'
        }
    }*/
}	
