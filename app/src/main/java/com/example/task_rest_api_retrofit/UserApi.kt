package com.example.task_rest_api_retrofit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("login")
    fun  login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}