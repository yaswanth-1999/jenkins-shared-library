def call(String imageName, String tag) {
    stage('Push Image') {
        sh "docker push ${imageName}:${tag}"
    }
}
