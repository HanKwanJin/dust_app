package com.han.dust_app.data.models.airquality

import androidx.annotation.ColorRes
import com.google.gson.annotations.SerializedName
import com.han.dust_app.R

enum class Grade(
    val label:String,
    val emoji: String,
    @ColorRes val colorResId: Int
    ) {

    @SerializedName("1")
    GOOD("좋음","\uD83D\uDE03", R.color.blue),

    @SerializedName("2")
    NORMAL("보통", "\uD83D\uDE42", R.color.green),

    @SerializedName("3")
    BAD("나쁨", "\uD83D\uDE22", R.color.yellow),

    @SerializedName("4")
    AWFUL("매우 나쁨", "\uD83D\uDE31", R.color.red),

    UNKNOWN("미측정", "\uD83D\uDE10", R.color.gray);

    override fun toString(): String {
        return "$label $emoji"
    }
}