package com.rakib.shapeshifter

import retrofit2.http.*

interface ShapeShifterApi {
    @GET()
    suspend fun getFromDynamicUrl(
        @Url dynamicUrl: String
    ): List<Page>

    @POST()
    suspend fun postToDynamicUrl(
        @Url dynamicUrl: String,
        @Body dynamicBody: Map<String, String>
    ): Response
}