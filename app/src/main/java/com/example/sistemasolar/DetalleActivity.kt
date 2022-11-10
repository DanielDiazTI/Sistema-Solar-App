package com.example.sistemasolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.sistemasolar.Adapters.MenuData
import com.example.sistemasolar.databinding.ActivityDetalleBinding

class DetalleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu: MenuData = intent.getSerializableExtra("detalles") as MenuData

        binding.tvNameDetail.setText(menu.titulo)
        binding.tvtypeDetail.setText(menu.tipo)
        binding.tvDistanceDetail.setText(menu.distancia)
        binding.tvDescriptionDetail.setText(menu.descripcion)
        binding.ivImgDetail.setImageResource(menu.images)
        binding.ivimagesDetail.setImageResource(menu.img)

    }
}