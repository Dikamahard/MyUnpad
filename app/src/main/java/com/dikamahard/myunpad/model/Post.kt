package com.dikamahard.myunpad.model

data class Post(
    val judul: String,
    val konten: String,
    val penulis: String,
    var kategori: String? = null,
    var gambar: String? = null
)
