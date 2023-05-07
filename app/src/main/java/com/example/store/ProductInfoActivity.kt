package com.example.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductInfoActivity : ChildrenActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_product_info)
    }
}