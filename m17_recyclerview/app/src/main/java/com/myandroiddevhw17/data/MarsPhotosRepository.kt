package com.myandroiddevhw17.data

import com.myandroiddevhw17.data.api.RetrofitBuilder
import com.myandroiddevhw17.data.dto.PhotoDto
import javax.inject.Inject

class MarsPhotosRepository @Inject constructor() {
    suspend fun getMarsPhotoByDate(date: String): List<PhotoDto> {
        return RetrofitBuilder.apiService.getMarsPhotoByDate(date).photos
    }
}