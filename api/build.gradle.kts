plugins {
    id("java")
}

group = "ru.netology"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":db"))
    implementation(project(":service"))
}

tasks.test {
    useJUnitPlatform()
}