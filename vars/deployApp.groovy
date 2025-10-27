def call(String appName) {
    stage('Deploy') {
        echo "Deploying ${appName}..."
        sh "kubectl apply -f k8s/${appName}.yaml"
    }
}
