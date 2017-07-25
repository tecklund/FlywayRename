package org.blinkmob.flywayrename

import org.gradle.api.Project
import org.gradle.api.Plugin

class FlywayRenamePlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('flywayRename', type: FlywayRenameTask)
    }
}
