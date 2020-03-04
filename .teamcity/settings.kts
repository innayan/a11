import jetbrains.buildServer.configs.kotlin.v2019_2.*

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2019.2"

project {

    buildType(Manyparams)
}

object Manyparams : BuildType({
    name = "manyparams"

    params {
        password("a11", "credentialsJSON:a0f7d6c0-e9ee-44a1-a98b-707f6cac85d7")
        password("c11", "credentialsJSON:f2cc2acd-3a15-4e0a-bef9-9d6d3880bfe8")
        password("b11", "credentialsJSON:bd07a56d-43a7-487a-82bb-be419e10c742")
        password("d11", "credentialsJSON:e26a1d3b-1277-41cc-9c69-72213e9e751c")
    }
})
