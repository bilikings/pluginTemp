package com.github.bilikings.plugintemp.services

import com.github.bilikings.plugintemp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
