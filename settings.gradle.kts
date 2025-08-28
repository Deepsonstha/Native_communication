pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://storage.googleapis.com/download.flutter.io")
    }
}

rootProject.name = "Native_communication"
include(":app")
val includeFlutter = File("/Users/imedigital/office_projects/global_module/.android/include_flutter.groovy")
check(includeFlutter.exists()) { "include_flutter.groovy not found at: ${includeFlutter.absolutePath}" }
apply(from = includeFlutter)
