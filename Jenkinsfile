node {
    stage('Compile') {
        checkout scm
        sh './gradlew compileJava'
    }
    stage('Test') {
        sh './gradlew test'
    }
    stage('proceed?') {
        milestone()
        input message: "Are you sure you want to proceed?"
        milestone()
    }
    stage('finished') {
    }
}