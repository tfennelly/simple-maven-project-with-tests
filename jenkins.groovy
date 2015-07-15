node {
    def mvnHome = tool 'M3'

    stage 'Checkout'
    git url: 'https://github.com/tfennelly/simple-maven-project-with-tests.git'
    
    stage 'Build'
    sh "${mvnHome}/bin/mvn clean install"
}
