node {  
    stage('Pull') { 
        git branch: 'main', url: 'https://github.com/vatanbokade/My_Repo.git'
    }
    stage('Build') { 
        echo "Build Done"
    }
    stage('Test') { 
        echo "Test Done"
    }
    stage('Deploy') { 
        echo "Deploy Done"
    }
}