def call(String message, String color='good') {
    slackSend(
        channel: '#ci-cd',
        color: color,
        message: message
    )
}
