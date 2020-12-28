package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllDatas {
    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("slug")
    @Expose
    var slug: String? = null

    @SerializedName("bitly_gif_url")
    @Expose
    var bitlyGifUrl: String? = null

    @SerializedName("bitly_url")
    @Expose
    var bitlyUrl: String? = null

    @SerializedName("embed_url")
    @Expose
    var embedUrl: String? = null

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("source")
    @Expose
    var source: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("rating")
    @Expose
    var rating: String? = null

    @SerializedName("content_url")
    @Expose
    var contentUrl: String? = null

    @SerializedName("source_tld")
    @Expose
    var sourceTld: String? = null

    @SerializedName("source_post_url")
    @Expose
    var sourcePostUrl: String? = null

    @SerializedName("is_sticker")
    @Expose
    var isSticker: Int? = null

    @SerializedName("import_datetime")
    @Expose
    var importDatetime: String? = null

    @SerializedName("trending_datetime")
    @Expose
    var trendingDatetime: String? = null

    @SerializedName("images")
    @Expose
    var images: AllImages? = null

    @SerializedName("analytics_response_payload")
    @Expose
    var analyticsResponsePayload: String? = null

    @SerializedName("analytics")
    @Expose
    var analytics: Analytics? = null
}