def call(String imageName, String tag = 'latest') {
    sh """
        docker build -t ${imageName}:${tag} .
    """
}
