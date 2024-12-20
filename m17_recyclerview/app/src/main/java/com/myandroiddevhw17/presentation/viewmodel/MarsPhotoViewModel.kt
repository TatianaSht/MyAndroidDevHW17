package com.myandroiddevhw17.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.myandroiddevhw17.domain.GetMarsPhotoUseCase
import com.myandroiddevhw17.entity.Photo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

class MarsPhotoViewModel @Inject constructor(

    private val getMarsPhotoUseCase: GetMarsPhotoUseCase
): ViewModel() {

    private val _photoFlow: MutableStateFlow<List<Photo>?> = MutableStateFlow(null)

    var photoFlow = _photoFlow.asStateFlow()

}