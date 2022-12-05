package com.zxmjs.compose.bean

import com.google.gson.annotations.SerializedName


data class NewsChannelsBean(
    @SerializedName("Id") val id: Int,
    @SerializedName("Name") val name: String
)