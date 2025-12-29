def call(String imageName, String tag = 'latest') {

    if (imageName.contains(':')) {
        error "Invalid imageName '${imageName}'. Do not include tag. Pass tag separately."
    }

    sh """
        docker build -t ${imageName}:${tag} .
    """
}
