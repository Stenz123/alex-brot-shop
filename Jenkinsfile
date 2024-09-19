
pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh './gradlew build'
                }
            }
        }
        //stage('Publish Artifact to Nexus') {
        //    steps {
        //        sh './gradlew publish --no-daemon'
        //    }
        //}
    }
}
