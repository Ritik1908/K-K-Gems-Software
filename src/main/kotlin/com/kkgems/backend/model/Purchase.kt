package com.kkgems.backend.model

data class Purchase(
        val id: String,
        val invoiceNumber: String,
        val vendorId: String,
        val weight: String,
        val amount: String
)
