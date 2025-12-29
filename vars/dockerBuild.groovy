def call(String imageName, String tag) {
    stage('Docker Build') {
        sh "docker build -t ${imageName}:${tag} ."
    }
}
