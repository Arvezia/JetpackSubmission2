package com.naufaldy.moviecatalog.data.source.remote.api

import com.naufaldy.moviecatalog.BuildConfig
import com.naufaldy.moviecatalog.data.source.remote.response.*

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/now_playing")
    fun getMovieList(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<ResultResponse<MovieResponse>>

    @GET("tv/on_the_air")
    fun getTvShowList(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<ResultResponse<TVShowsResponse>>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<MovieResponse>

    @GET("tv/{tv_id}")
    fun getDetailTvShow(
        @Path("tv_id") tvShowId: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ) : Call<TVShowsResponse>

}