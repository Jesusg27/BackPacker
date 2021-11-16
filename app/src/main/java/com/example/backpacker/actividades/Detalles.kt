package com.example.backpacker.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.backpacker.R
import com.example.backpacker.clasesdatos.Pelicula
import kotlinx.android.synthetic.main.activity_detalles.*

class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val pelicula = intent.getSerializableExtra("pel") as Pelicula

        adTvTitulo.text = getString(R.string.titulo, pelicula.titulo)
        adTvDirector.text = getString(R.string.lugar, pelicula.lugar)
        adTvGenero.text = getString(R.string.Descripcion, pelicula.descripcion)
        adTvCalificacion.text = getString(R.string.calificacion, pelicula.calificacion.toString())
        adTvDuracion.text = getString(R.string.horarios, pelicula.horarios.toString())
        adTvFecha.text = getString(R.string.disponibilidad, pelicula.disponibilidad)

    }
}
