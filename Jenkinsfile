pipeline{
    agent any
    tools{
        maven 'maven_3_9_1'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/jovanazivkovic99/SimpleJenkinsCICD']])
                sh (
                   script: 'mvn clean install',
                   returnStatus: true
                 )
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    sh 'docker build -t jovanazivkovic/devops-integration .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpsw')]) {
                        sh 'echo "${dockerhubpsw}" | docker login -u jovanazivkovic --password-stdin'
                    }
                    sh 'docker push jovanazivkovic/devops-integration'
                }
            }
        }
    }
}