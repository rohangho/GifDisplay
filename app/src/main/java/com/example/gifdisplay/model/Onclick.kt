package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Onclick {
    @SerializedName("url")
    @Expose
    var url: String? = null
}