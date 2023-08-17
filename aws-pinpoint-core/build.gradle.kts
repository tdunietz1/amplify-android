/*
 * Copyright 2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

plugins {
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.10"
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.kotlin.android")
}

apply(from = rootProject.file("configuration/checkstyle.gradle"))
apply(from = rootProject.file("configuration/publishing.gradle"))

group = properties["POM_GROUP"].toString()

dependencies {
    implementation(project(":core"))

    implementation(dependency.androidx.appcompat)
    implementation(dependency.aws.pinpoint)
    implementation(dependency.kotlin.serializationJson)
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    implementation("androidx.core:core-ktx:+")

    testImplementation(testDependency.junit)
    testImplementation(testDependency.mockk)
    testImplementation(testDependency.mockito)
    testImplementation(testDependency.mockitoinline)
    testImplementation(testDependency.robolectric)
    testImplementation(testDependency.androidx.test.core)
    testImplementation(testDependency.kotlin.test.coroutines)

    androidTestImplementation(testDependency.androidx.test.core)
    androidTestImplementation(testDependency.androidx.test.runner)
    androidTestImplementation(testDependency.androidx.test.junit)
}
