package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FixedHeight {
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

    @SerializedName("mp4_size")
    @Expose
    var mp4Size: String? = null

    @SerializedName("mp4")
    @Expose
    var mp4: String? = null

    @SerializedName("webp_size")
    @Expose
    var webpSize: String? = null

    @SerializedName("webp")
    @Expose
    var webp: String? = null
}