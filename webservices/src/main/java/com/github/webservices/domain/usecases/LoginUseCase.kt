package com.github.webservices.domain.usecases

import com.github.webservices.domain.model.login.LoginRequest
import com.github.webservices.domain.repo.WsRepo
import javax.inject.Inject

class LoginUseCase  @Inject constructor(val wsRepo: WsRepo) {
    suspend operator fun invoke(request: LoginRequest) = wsRepo.login(request)
}