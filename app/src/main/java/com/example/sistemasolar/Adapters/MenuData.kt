package com.example.sistemasolar.Adapters

import java.io.Serializable

data class MenuData(
    var titulo:String,
    var subtitulo:String,
    var distancia:String,
    var descripcion:String,
    var tipo:String,
    var img: Int,
    var images: Int

): Serializable
