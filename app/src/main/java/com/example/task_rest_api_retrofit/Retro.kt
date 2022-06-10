package com.example.task_rest_api_retrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retro {
    fun getRetroClientInstance(): Retrofit {
        val gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl("http://192.168.112.1:5000/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}