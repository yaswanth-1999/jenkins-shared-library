def call() {

    stage('Checkout') {
        git branch: 'main',
            url: 'https://github.com/yaswanth-1999/spring-boot-hello-world.git'
    }

    stage('Build') {
        sh 'mvn clean install'
    }
}

