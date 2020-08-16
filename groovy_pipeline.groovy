node('master') {
    stage('test') {
        echo "hello world!"
	sh '''
		python --version
		pip --version
	'''
    }
}
