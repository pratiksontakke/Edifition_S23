package com.example.postapplication.respapi

data class OrderStatu(
    val address_id: String,
    val bank_txn_id: Any,
    val bill_image: Any,
    val capture_status: String,
    val category_type_id: String,
    val coupon_id: String,
    val created_at: String,
    val delivered_package_image: Any,
    val delivery_boy_id: String,
    val delivery_instructions: String,
    val delivery_option: String,
    val discount_amount: String,
    val id: String,
    val invoice_sent: String,
    val is_accept: String,
    val is_delivery_accept: String,
    val is_priority: String,
    val merchant_instructions: Any,
    val order_status: String,
    val package_image: Any,
    val payment_amount: String,
    val payment_bank: Any,
    val payment_mode: String,
    val payout_initiated: Any,
    val placed_at: String,
    val promo_id: String,
    val razor_pay_order_id: String,
    val razorpay_route_response_json: Any,
    val refund_json: Any,
    val refund_status: String,
    val summary_sent: String,
    val updated_at: String,
    val user_id: String
)