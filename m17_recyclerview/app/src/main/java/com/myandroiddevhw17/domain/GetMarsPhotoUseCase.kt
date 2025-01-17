package com.myandroiddevhw17.domain

import com.myandroiddevhw17.data.MarsPhotosRepository
import com.myandroiddevhw17.entity.Photo
import javax.inject.Inject

class GetMarsPhotoUseCase @Inject constructor(

    private val marsPhotosRepository: MarsPhotosRepository
) {
    suspend fun execute(date: String): List<Photo> {
        return marsPhotosRepository.getMarsPhotoByDate(date)
    }
}