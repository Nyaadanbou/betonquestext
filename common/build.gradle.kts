dependencies {
    // server
    compileOnlyApi(libs.server.paper)

    // helper
    compileOnlyApi(libs.helper)

    // standalone plugins
    compileOnlyApi(libs.betonquest) {
        exclude("io.papermc")
        exclude("com.comphenix.packetwrapper")
        exclude("me.filoghost.holographicdisplays")
    }
}
