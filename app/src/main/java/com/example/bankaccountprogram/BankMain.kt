package com.example.bankaccountprogram

fun main(){

    val minalBankAccount = BankAccount("Minal Ghate", 9000.00)
    val sarahBankAccount = BankAccount("Sarah",0.0)

    minalBankAccount.deposit(1000.00)
    minalBankAccount.withdraw(50_000.0)
    minalBankAccount.withdraw(6000.0)
    minalBankAccount.deposit(9000.0)

    minalBankAccount.displayTransactionHistory()

    //println("Total balance in ${minalBankAccount.accountHolder} account is ${minalBankAccount.balance}")

    minalBankAccount.acctBalance()
    println()



    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)

    sarahBankAccount.displayTransactionHistory()
    sarahBankAccount.acctBalance()


}