pipeline {	 
	agent any	 
    stages {     	 
    	stage("Compile") {          	 
            steps {               	 
               	sh "mvn compile war:war"          	 
            }     	 
        }     	 
    	stage("Unit Test") {          	 
        	steps {               	 
               	sh "mvn test"          	 
            }     	 
        }	 
    }
}
