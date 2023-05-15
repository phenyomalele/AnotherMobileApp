package com.example.anotherloginapp

import retrofit2.Response

class UserRepository {
    suspend fun loginUser(loginRequest:LoginRequest): Response<LoginResponse>? {
        return UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    } }