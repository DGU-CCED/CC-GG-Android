package com.example.howlstagram.navigation.model

data class FollowDTO(
    var followerCount: Int = 0,
    var followers: MutableMap<String, Boolean> = HashMap(),

    var follwingCount: Int = 0,
    var follwings: MutableMap<String, Boolean> = HashMap()
)