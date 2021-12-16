package com.github.webservices.domain.model.login


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("errMessage")
    val errMessage: String,
    @SerializedName("token")
    val token: String
)