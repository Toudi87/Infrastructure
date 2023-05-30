pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/Toudi87/Frontend.git")
                    }
                    branches('main') 
                    scriptPath('Jenkinsfile') 
                }
            }
        }
    }
}