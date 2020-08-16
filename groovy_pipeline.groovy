node('master') {
    stage('test') {
        echo "hello world!"
	sh '''
		apt-get install software-properties-common		
		add-apt-repository ppa:deadsnakes/ppa
		apt update
		apt-get install python3.8
		apt install python3-pip		
		python --version
		pip --version
	'''
    }
}
