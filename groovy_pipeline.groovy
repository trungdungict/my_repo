node('master') {
    stage('test') {
        echo "hello world!"
	sh '''
		sudo apt-get install software-properties-common		
		sudo add-apt-repository ppa:deadsnakes/ppa
		sudo apt update
		sudo apt-get install python3.8
		sudo apt install python3-pip		
		python --version
		pip --version
	'''
    }
}
