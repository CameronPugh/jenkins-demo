pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('restaurant-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/CameronPugh/Restaurant-RESTful-API.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
