def call(String projectKey) {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarQube') {
            sh """
              mvn sonar:sonar \
              -Dsonar.projectKey=${projectKey}
            """
        }
    }
}
