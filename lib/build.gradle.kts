dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("com.konghq:unirest-java:3.13.6")
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.11")
    implementation("io.provenance.scope:encryption:0.5.1")
    implementation("io.provenance.scope:util:0.5.1")

    testImplementation("io.kotest:kotest-assertions-core-jvm:5.2.1")
    testImplementation("io.kotest:kotest-property-jvm:5.2.1")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.2.1")
    testImplementation("io.kotest:kotest-framework-datatest-jvm:5.2.1")
    testImplementation("org.slf4j:slf4j-simple:1.7.36")
    testImplementation("io.mockk:mockk:1.12.2")
}