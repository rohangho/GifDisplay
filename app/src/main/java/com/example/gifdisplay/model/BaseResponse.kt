package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BaseResponse {
    @SerializedName("data")
    @Expose
    var data: List<AllDatas>? = null

    @SerializedName("pagination")
    @Expose
    var pagination: Pagination? = null

    @SerializedName("meta")
    @Expose
    var meta: Meta? = null
}