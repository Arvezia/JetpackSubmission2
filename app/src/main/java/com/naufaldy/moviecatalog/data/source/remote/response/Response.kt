package com.naufaldy.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ResultResponse<T>(
    @SerializedName("results")
    val result: List<T>? = null
)