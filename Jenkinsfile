node{
  stage('SCM Checkout'){
    git 'https://github.com/nishant973/limits-service'
  }
  stage('Compile Package'){
   // def mvnHome = tool name: 'maven', type: 'maven'
   // sh "${mvnHome}/bin/mvn package"
   // above for unix , below for windows
      bat "mvn package" 
  }
}
