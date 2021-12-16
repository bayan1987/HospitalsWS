package com.github.webservices.domain.repo


import com.github.webservices.domain.model.login.LoginRequest
import com.github.webservices.domain.model.login.LoginResponse
import retrofit2.Response

interface WsRepo {

    suspend fun login( request: LoginRequest) : Response<LoginResponse>
}