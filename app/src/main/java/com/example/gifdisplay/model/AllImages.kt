package com.example.gifdisplay.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllImages {
    @SerializedName("original")
    @Expose
    var original: Original? = null

    @SerializedName("downsized")
    @Expose
    var downsized: Downsized? = null

    @SerializedName("downsized_large")
    @Expose
    var downsizedLarge: DownsizedLarge? = null

    @SerializedName("downsized_medium")
    @Expose
    var downsizedMedium: DownsizedMedium? = null

    @SerializedName("downsized_small")
    @Expose
    var downsizedSmall: DownsizedSmall? = null

    @SerializedName("downsized_still")
    @Expose
    var downsizedStill: DownsizedStill? = null

    @SerializedName("fixed_height")
    @Expose
    var fixedHeight: FixedHeight? = null

    @SerializedName("fixed_height_downsampled")
    @Expose
    var fixedHeightDownsampled: FixedHeightDownsampled? = null

    @SerializedName("fixed_height_small")
    @Expose
    var fixedHeightSmall: FixedHeightSmall? = null

    @SerializedName("fixed_height_small_still")
    @Expose
    var fixedHeightSmallStill: FixedHeightSmallStill? = null

    @SerializedName("fixed_height_still")
    @Expose
    var fixedHeightStill: FixedHeightStill? = null

    @SerializedName("fixed_width")
    @Expose
    var fixedWidth: FixedWidth? = null

    @SerializedName("fixed_width_downsampled")
    @Expose
    var fixedWidthDownsampled: FixedWidthDownsampled? = null

    @SerializedName("fixed_width_small")
    @Expose
    var fixedWidthSmall: FixedWidthSmall? = null

    @SerializedName("fixed_width_small_still")
    @Expose
    var fixedWidthSmallStill: FixedWidthSmallStill? = null

    @SerializedName("fixed_width_still")
    @Expose
    var fixedWidthStill: FixedWidthStill? = null

    @SerializedName("looping")
    @Expose
    var looping: Looping? = null

    @SerializedName("original_still")
    @Expose
    var originalStill: OriginalStill? = null

    @SerializedName("original_mp4")
    @Expose
    var originalMp4: OriginalMp4? = null

    @SerializedName("preview")
    @Expose
    var preview: PreviewDisplay? = null

    @SerializedName("preview_gif")
    @Expose
    var previewGif: PreviewGif? = null

    @SerializedName("preview_webp")
    @Expose
    var previewWebp: PreviewWebp? = null

    @SerializedName("480w_still")
    @Expose
    private var _480wStill: FourStill? = null
    fun get480wStill(): FourStill? {
        return _480wStill
    }

    fun set480wStill(_480wStill: FourStill?) {
        this._480wStill = _480wStill
    }
}