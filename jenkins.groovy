node {
    def mvnHome = tool 'M3'

    stage 'Build'
    sh "${mvnHome}/bin/mvn clean install"
}
