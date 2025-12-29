def call(String imageName, String tag = 'latest') {

    if (imageName.contains(':')) {
        error "Invalid imageName '${imageName}'. Do not include tag."
    }

    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-creds',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
            docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}
            docker tag ${imageName}:${tag} ${DOCKER_USER}/${imageName}:${tag}
            docker push ${DOCKER_USER}/${imageName}:${tag}
        """
    }
}
