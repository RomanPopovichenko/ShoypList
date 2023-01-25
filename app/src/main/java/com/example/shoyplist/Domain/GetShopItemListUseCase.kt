package com.example.shoyplist.Domain

data class GetShopItemListUseCase (
    val id: Int,
    val name: String,
    val count: Int,
    val isActive: Boolean
    )