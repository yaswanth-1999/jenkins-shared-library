// vars/dockerBuild.groovy
def call(String imageName, String tag = 'latest') {

    // Validate imageName does not contain colon
    if (imageName.contains(':')) {
        error "Invalid imageName '${imageName}'. Do not include tag. Pass tag separately."
    }

    // Docker build
    sh """
        docker build -t ${imageName}:${tag} .
    """
}
