node{
  stage('SCM Checkout'){
    git 'https://github.com/nishant973/limits-service'
  }
  stage('Compile Package'){
    def mvnHome = tool name: 'maven', type: 'maven'
    println "mvn home is ${mvnHome}"
    sh "${mvnHome}/bin/mvn package"
  }
}
