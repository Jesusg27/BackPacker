package com.example.backpacker.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.backpacker.R
import com.example.backpacker.clasesdatos.Pelicula
import com.example.backpacker.actividades.Detalles
import com.example.backpacker.actividades.VisorImagen
import kotlinx.android.synthetic.main.elemento_lista_pelicula.view.*

class AdaptadorPeliculas(private var lista: ArrayList<Pelicula>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorPeliculas.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.elemento_lista_pelicula,
                parent,
                false
            ), contexto
        )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(pelicula: Pelicula) {
            vista.elpIvPelicula.setImageResource(pelicula.idImagen)
            vista.elpTvTitulo.text = pelicula.titulo
            vista.elpTvGenero.text = pelicula.descripcion
            vista.elpRbCalificacion.rating = pelicula.calificacion.toFloat()

            vista.elpIvPelicula.setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagen::class.java).putExtra("pel", pelicula))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles::class.java).putExtra("pel", pelicula))
            }
        }
    }

}