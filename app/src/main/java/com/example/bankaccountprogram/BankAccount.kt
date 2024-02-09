package com.example.bankaccountprogram

class BankAccount(
    var accountHolder : String,
    var balance : Double)
{

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited Rs.$amount")
    }

    fun withdraw(amount: Double){
        if(amount<=balance){
            //can withdraw
            balance-=amount
            transactionHistory.add("$accountHolder withdrew Rs.$amount")

        }
        else{
            //cannot withdraw
            println("You don't have required funds to withdrew")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history of $accountHolder:")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }

    fun acctBalance(){
        println("Balance available in $accountHolder account is $balance")
    }

}