package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Pagination {
    @SerializedName("total_count")
    @Expose
    var totalCount: Int? = null

    @SerializedName("count")
    @Expose
    var count: Int? = null

    @SerializedName("offset")
    @Expose
    var offset: Int? = null
}