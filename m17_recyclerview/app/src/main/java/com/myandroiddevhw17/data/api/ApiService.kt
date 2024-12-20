package com.myandroiddevhw17.data.api

import com.myandroiddevhw17.data.dto.PhotosDto
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "uM4ja6t56LBnyZsJPHh8yP42BtK5q968ZvJxIBkK"

interface ApiService {
    @GET("/mars-photos/api/v1/rovers/curiosity/photos")
    suspend fun getMarsPhotoByDate(
        @Query("earth_date") earthDate: String,
        @Query("api_key") apiKey: String = API_KEY
    ): PhotosDto
}