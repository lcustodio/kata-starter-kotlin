plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kata-starter-kotlin"
include("src:test:com.luiscustodio")
findProject(":src:test:com.luiscustodio")?.name = "com.luiscustodio"
