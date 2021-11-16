package com.example.backpacker.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.backpacker.R
import com.example.backpacker.clasesdatos.Pelicula
import com.example.backpacker.adaptadores.AdaptadorPeliculas
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        amRvPeliculas.layoutManager = LinearLayoutManager(this)
        amRvPeliculas.adapter = AdaptadorPeliculas(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Pelicula>{
        val lista = ArrayList<Pelicula>()
        lista.add(Pelicula(R.drawable.interestelar, "Holbox", "Quintana Roo, México", "Paraiso Natural", 4.3, 360, "Todo el año"))
        lista.add(Pelicula(R.drawable.forma_agua, "Xcaret", "Quintana Roo, México", "Hermosas playas y diversion", 3.65, 360, "Todo el año"))
        lista.add(Pelicula(R.drawable.xelha, "Xelha", "Quintana Roo, México", "Vistas de naturaleza y relajacion", 4.0, 360, "Todo el año"))
        lista.add(Pelicula(R.drawable.la_llegada, "Ruinas del Rey Cancun", "Quintana Roo, México", "Grandes estructuras de la epoca de los mayas", 3.95, 360, "Todo el año"))
        lista.add(Pelicula(R.drawable.ex_maquina, "Ruinas Mayas Tulum", "Quintana Roo, México", "Ruinas mayas Increibles junto con una vista al mar", 3.85, 360, "Todo el año"))
        lista.add(Pelicula(R.drawable.jumanji, "Isla Mujeres", "Quintana Roo, México", "Hermosas playas hoteles de lujo y lugares fantasticos", 3.5, 360, "Todo el año"))

        return lista
    }

}
