# FlywayRenamePlugin

This plugin renames all the files in the blob `src/main/resources/db/migration/**.sql` that do not start with V.+__ to be pre-pended with V{timestamp}__

This is extremely useful when using flyway - no longer are you forced to version your files by hand!

For extra convenience add `flywayMigrate.dependsOn flywayRename` to your build script. Happy migrating! 
