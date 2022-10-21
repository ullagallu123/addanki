pipeline{
    agent{
        label "slave-1"
    }
    stages{
        stage("Git Checkout"){
            steps{
                git branch: 'dev', url: 'https://github.com/ullagallu123/addanki.git'
            }    
        }
    }
}