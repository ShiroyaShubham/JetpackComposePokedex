package com.example.jetpackcomposepokedex.model

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)