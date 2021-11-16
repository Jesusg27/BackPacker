package com.example.backpacker.clasesdatos

import java.io.Serializable

data class Pelicula (
    var idImagen: Int,
    var titulo: String,
    var lugar: String,
    var descripcion: String,
    var calificacion: Double,
    var horarios: Int,
    var disponibilidad: String
) : Serializable