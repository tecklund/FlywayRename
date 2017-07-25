# FlywayRenamePlugin

## Description

This plugin renames all the files in the blob `src/main/resources/db/migration/**.sql` that do not start with V.+__ to be pre-pended with V{timestamp}__

This is extremely useful when using flyway - no longer are you forced to version your files by hand!

## Usage

```plugins {
    id "org.flywaydb.flyway" version "4.1.2"
  	id "org.blinkmob.flywayrename" version "1.0.0"
}```

For extra convenience add `flywayMigrate.dependsOn flywayRename` to your build script. Happy migrating!
