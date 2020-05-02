package com.pryercarvs.library_extension.source.model

import android.net.Uri

class Page(
    val index: Int,
    val url: String = "",
    var imageUrl: String? = null,
    var uri: Uri? = null
)