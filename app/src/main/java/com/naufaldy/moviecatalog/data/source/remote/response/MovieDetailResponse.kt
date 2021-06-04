package com.naufaldy.moviecatalog.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieDetailResponse (
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("title")
    var title: String? = null,
    @SerializedName("overview")
    var synopsis: String? = null,
    @SerializedName("poster_path")
    var poster: String? = null,
    @SerializedName("Result")
    var result: List<MovieResponse>
)