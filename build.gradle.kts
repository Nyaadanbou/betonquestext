// plugins {
//     // See: https://docs.gradle.org/current/userguide/plugins.html#sec:subprojects_plugins_dsl
//     id("io.freefair.lombok") version "8.0.1" apply false
// }

subprojects {
    apply(plugin = "cc.mewcraft.repo-conventions")
    apply(plugin = "cc.mewcraft.java-conventions")

    group = "cc.mewcraft.betonquest"
}
