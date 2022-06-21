package com.rakib.shapeshifter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class Response(
    @Json(name = "data")
    val pageSettings: List<PageSettings> = listOf(),
    @Json(name = "response")
    val response : List<ResponseType?>
)

@JsonClass(generateAdapter = true)
data class ResponseType(
    @Json(name = "key")
    val key: String,
    @Json(name = "value")
    val value : Any,
    @Json(name = "type")
    val type: String
)

@JsonClass(generateAdapter = true)
data class PageSettings(
    @Json(name = "type")
    val type : String?,
    @Json(name = "children")
    val children : List<PageSettings>? = listOf(),
    @Json(name = "value")
    val value: String?,
    @Json(name = "id")
    val id: String?,
    @Json(name = "hint")
    val hint: String?,
    @Json(name = "cpsName")
    val cpsName: String?,
)




