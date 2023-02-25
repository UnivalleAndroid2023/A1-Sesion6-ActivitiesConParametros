package com.gonzalezblanchard.sesion6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gonzalezblanchard.sesion6.databinding.ActivityDetailPokemonBinding
import com.squareup.picasso.Picasso

class DetailPokemonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPokemonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPokemonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the Intent that started this activity and extract the string
        val titulo = intent.getStringExtra("TITULO")
        val descripcion = intent.getStringExtra("DESCRIPCION")
        val foto = intent.getStringExtra("FOTO")

        binding.titulo.text = titulo
        binding.descripcion.text = descripcion

        Picasso.get().load(foto).into(binding.foto);

    }

    fun finalizar(view: View){
        finish()
    }

}