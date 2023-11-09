pluginManagement {
    repositories {
        maven("https://repo1.maven.org/maven2")
        maven("https://maven.aliyun.com/nexus/content/groups/public")
        maven("https://maven.aliyun.com/nexus/content/repositories/releases/")
        maven("https://maven.aliyun.com/repository/central")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://jitpack.io")
        maven("https://maven.aliyun.com/repository/jcenter")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BaseProject"
include(":app")

File("${rootDir}/modules").listFiles()?.onEach {
    if (it.isDirectory) {
        include(":modules:${it.name}")
    }
}