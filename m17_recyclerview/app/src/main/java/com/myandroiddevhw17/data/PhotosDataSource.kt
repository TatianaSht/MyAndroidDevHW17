package com.myandroiddevhw17.data

import com.myandroiddevhw17.data.api.RetrofitBuilder
import com.myandroiddevhw17.data.dto.PhotosDto
import javax.inject.Inject

class PhotoDataSource @Inject constructor() {

    suspend fun loadPhotos(date: String): PhotosDto {
        return RetrofitBuilder.apiService.getMarsPhotoByDate(date)
    }
}

