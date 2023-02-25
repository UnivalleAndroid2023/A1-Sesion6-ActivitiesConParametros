package com.gonzalezblanchard.sesion6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gonzalezblanchard.sesion6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun cambiarPantalla(view: View){
        val intent = Intent(this, DetailPokemonActivity::class.java).apply {
            putExtra("TITULO", "Pikachu")
            putExtra("DESCRIPCION", "Es un pokemno electrico")
            putExtra("FOTO", "https://www.gratistodo.com/wp-content/uploads/2016/11/Pikachu-9.png")
        }
        startActivity(intent)
    }

    fun cambiarPantallaCharizard(view: View){
        val intent = Intent(this, DetailPokemonActivity::class.java).apply {
            putExtra("TITULO", "Charizard")
            putExtra("DESCRIPCION", "Charizard es una de las criaturas de la franquicia Pokémon. Se trata de un pokémon tipo fuego/volador, que aparece por primera vez en Pokémon Red y Blue, donde puede ser obtenido si el jugador elige")
            putExtra("FOTO", "https://i.pinimg.com/originals/e8/6b/86/e86b867b6369be2d0ea8d9024431f5b2.png")
        }
        startActivity(intent)
    }

}