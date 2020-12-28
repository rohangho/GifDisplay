package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Analytics {
    @SerializedName("onload")
    @Expose
    var onload: Onload? = null

    @SerializedName("onclick")
    @Expose
    var onclick: Onclick? = null

    @SerializedName("onsent")
    @Expose
    var onsent: Onsent? = null
}