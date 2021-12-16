package com.github.webservices.data.repoImpl


import com.github.webservices.data.api.APIEndpoints
import com.github.webservices.domain.model.login.LoginRequest
import com.github.webservices.domain.model.login.LoginResponse
import com.github.webservices.domain.repo.WsRepo
import retrofit2.Response

class RepoImpl (private val apiEndpoints: APIEndpoints) : WsRepo {

    override suspend fun login(request: LoginRequest): Response<LoginResponse> {
        return apiEndpoints.login(request)
    }
}