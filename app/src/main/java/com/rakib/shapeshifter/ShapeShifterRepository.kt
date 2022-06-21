package com.rakib.shapeshifter

import android.util.Log
import javax.inject.Inject

class ShapeShifterRepository @Inject constructor(
    private val shapeShifterApi: ShapeShifterApi
) {
    suspend fun getData(url: String): List<Page> {
        val response = shapeShifterApi.getFromDynamicUrl(url)

//        Log.d("rashdan", "${response.response[0]?.key.toString()} ${response.response[0]?.value.toString()}")
        return response
    }

    suspend fun postData() {
        shapeShifterApi.postToDynamicUrl(
            "",
            mapOf()
        )
    }
}