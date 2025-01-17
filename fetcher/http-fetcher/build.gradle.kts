plugins {
    buildsrc.convention.`kotlin-jvm`
    buildsrc.convention.`publish-jvm`
}

dependencies {
    api(projects.fetcher.baseFetcher)
    implementation(Deps.Ktor.client)
    implementation(Deps.Ktor.clientApache)
    implementation(Deps.Ktor.clientLogging)
    implementation(Deps.logback)
    implementation(Deps.log4jOverSlf4j)

    testImplementation(projects.testUtils)
}
