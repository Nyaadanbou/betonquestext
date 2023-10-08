import net.minecrell.pluginyml.paper.PaperPluginDescription

plugins {
    id("cc.mewcraft.deploy-conventions")
    alias(libs.plugins.pluginyml.paper)
}

project.ext.set("name", "BetonQuestExt")

group = "cc.mewcraft.betonquest"
version = "1.4.0"
description = "Brings BetonQuest more integrations with 3rd party plugins"

dependencies {
    implementation(project(":betonquestext:common"))
    implementation(project(":betonquestext:adventurelevel"))
    implementation(project(":betonquestext:brewery"))
    implementation(project(":betonquestext:itemsadder"))
    implementation(libs.evalex)
}

paper {
    main = "cc.mewcraft.betonquest.BetonQuestExt"
    name = project.ext.get("name") as String
    version = "${project.version}"
    description = project.description
    apiVersion = "1.19"
    authors = listOf("Nailm")
    serverDependencies {
        register("helper") {
            required = true
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.BEFORE
        }
        register("BetonQuest") {
            required = true
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.OMIT
        }
        register("ItemsAdder") {
            required = false
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.OMIT
        }
        register("Brewery") {
            required = false
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.OMIT
        }
        register("AdventureLevel") {
            required = false
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.OMIT
        }
    }
}
