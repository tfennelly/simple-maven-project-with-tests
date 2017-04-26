pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        withMaven() {
            sh """
            export JENKINS_MAVEN_AGENT_DISABLED=true
            mvn clean install
            """
        }
      }
    }
  }
}