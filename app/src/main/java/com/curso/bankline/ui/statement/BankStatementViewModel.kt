package com.curso.bankline.ui.statement

import androidx.lifecycle.ViewModel
import com.curso.bankline.data.BanklineRepository

class BankStatementViewModel : ViewModel() {

    fun findBankStatement(accountHolderId: Int) =
        BanklineRepository.findBankStatement(accountHolderId)
}