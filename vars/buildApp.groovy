def call(String appName) {
    stage('Build') {
        echo "Building application: ${appName}"
        sh "mvn clean package"
    }
}
