package org.blinkmob.flywayrename

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class FlywayRenameTask extends DefaultTask {

    @TaskAction
    def flywayRename() {
        def target = this.getProject()
        int ts = new Date().getTime() / 1000
        int count = 0
        target.fileTree(dir: 'src/main/resources/db/migration', include: ['**/*.sql'], exclude: ['**/V*__*.sql']).each{
            it.renameTo(it.parent + "/V" + ts + String.format('%03d',count++) + "__" + it.name)
        }
    }
}
