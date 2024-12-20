package com.myandroiddevhw17.data.dto

import com.myandroiddevhw17.entity.Rover

data class RoverDto(
    override val id: Int,
    override val name: String
): Rover