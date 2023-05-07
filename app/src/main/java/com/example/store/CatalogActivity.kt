package com.example.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CatalogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        val basketSwitchButton = findViewById<Button>(R.id.basketSwitchButton)
        basketSwitchButton.setOnClickListener {
            startActivity(Intent(this, BasketActivity::class.java))
        }

        val productInfoSwitchButton = findViewById<Button>(R.id.productInfoSwitchButton)
        productInfoSwitchButton.setOnClickListener {
            startActivity(Intent(this, ProductInfoActivity::class.java))
        }

    }
}