package com.example.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

public open class ChildrenActivity : AppCompatActivity() {
    override fun onOptionsItemSelected(item: MenuItem): Boolean
    {
        when (item.itemId)
        {
            android.R.id.home ->
            {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
    /*private var activityId:Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_main)
    }*/
}