def call(Map pipelineParameters) {  

    echo "Executing full CI/CD NPM pipeline for application ${pipelineParameters.appName}: Git server (${pipelineParameters.gitUrl}) and branch (${pipelineParameters.gitBranch})"

    npmCI(pipelineParameters)
    openshiftCD(pipelineParameters)
}
