package com.github.mierz00.csshandler.services

import com.intellij.openapi.project.Project
import com.github.mierz00.csshandler.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
