package com.myandroiddevhw17.data.dto

import com.myandroiddevhw17.entity.Camera

data class CameraDto (
    override val id: Int,
    override val name: String
): Camera