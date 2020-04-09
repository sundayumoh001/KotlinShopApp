package com.example.kotlinshopapp
//..app/src/main/java/yourPackage/Photo.kt
import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("filename")
    var filename: String? = null
)