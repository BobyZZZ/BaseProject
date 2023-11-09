println("network.gradle.kts is applied in project: ${project}")

apply(plugin = "kotlin-parcelize")

val retrofitVersion = "2.9.0"
val fruitVersion = "1.0.5"
dependencies {
    add("implementation", "com.squareup.retrofit2:retrofit:${retrofitVersion}")
    add("implementation", "com.squareup.retrofit2:converter-gson:${retrofitVersion}")
    add("implementation", "me.ghui:fruit-converter-retrofit:${fruitVersion}")
}