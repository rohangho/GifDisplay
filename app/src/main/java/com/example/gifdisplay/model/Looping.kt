package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Looping {
    @SerializedName("mp4_size")
    @Expose
    var mp4Size: String? = null

    @SerializedName("mp4")
    @Expose
    var mp4: String? = null
}