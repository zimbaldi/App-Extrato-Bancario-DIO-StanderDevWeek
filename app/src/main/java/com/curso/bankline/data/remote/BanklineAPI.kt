package com.curso.bankline.data.remote

import com.curso.bankline.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path

interface BanklineAPI {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHolderId: Int): List<Movimentacao>
}