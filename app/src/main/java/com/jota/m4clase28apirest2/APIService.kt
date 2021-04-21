package com.jota.m4clase28apirest2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
        @GET
        fun getCharacterByName(@Url url:String): Call<DogsResponse>

}