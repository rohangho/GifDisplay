package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DownsizedStill {
    @SerializedName("height")
    @Expose
    var height: String? = null

    @SerializedName("width")
    @Expose
    var width: String? = null

    @SerializedName("size")
    @Expose
    var size: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null
}