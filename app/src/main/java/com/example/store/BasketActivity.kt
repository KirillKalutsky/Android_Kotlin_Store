package com.example.store

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BasketActivity : ChildrenActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_basket)

        val buttonOrder = findViewById<Button>(R.id.orderSwitchButton)
        buttonOrder.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }
    }
}