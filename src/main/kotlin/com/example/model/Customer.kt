package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val emailAddress: String
)

val customers = mutableListOf<Customer>(
    Customer("1","Sobhan","Daroogheh","Sobhan@gmail.com")
);