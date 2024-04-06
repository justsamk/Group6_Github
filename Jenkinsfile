pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                sh 'javac -d bin -cp src:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar src/Tests.java'
            }
        }

        stage('Test') {
    	    steps {
                sh 'java -cp bin:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore Tests'
    	    }
	}

    }
}
