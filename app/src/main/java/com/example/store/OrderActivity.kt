package com.example.store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.*
import androidx.core.widget.addTextChangedListener

class OrderActivity : ChildrenActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_main)

        println("Корзина")

        var discount = 10.0;
        var bananas = Product("Бананы", 100.0)
        var backet = BaseBasket(mutableListOf(bananas))
        backet.AddProduct(Product("Яблоки", 85.0))

        backet.SetDiscount(0.0);

        val totalPrice = findViewById<TextView>(R.id.textViewPrice)
        totalPrice.text = backet.CountCost().toString()

        backet.SetDiscount(discount);

        val resultPrice = findViewById<TextView>(R.id.textViewResultPrice)
        resultPrice.text = backet.CountCost().toString()

        val discountText = findViewById<TextView>(R.id.textViewDiscount)
        discountText.text = discount.toString();

        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextSurname = findViewById<EditText>(R.id.editTextSurname)
        val editTextLastName = findViewById<EditText>(R.id.editTextLastName)
        val buttonAccept = findViewById<Button>(R.id.buttonAccept)
        buttonAccept.isEnabled = false
        buttonAccept.isClickable = false

        editTextPhone.addTextChangedListener {
            if (editTextPhone.text.length == 11 && editTextPhone.text[0] == '8')
            {
                editTextPhone.error = null
                buttonAccept.isEnabled = true
                buttonAccept.isClickable = true
            }
            else
            {
                buttonAccept.isEnabled = false
                buttonAccept.isClickable = false
                editTextPhone.error = "Номер введён неправильно"
            }
        }

        buttonAccept.setOnClickListener {
            Toast.makeText(applicationContext,
                "${editTextSurname.text} ${editTextName.text} ${editTextLastName.text}\nВаш телефон ${editTextPhone.text}",
                Toast.LENGTH_LONG).show()
        }

        val presenter = Presenter(backet);
        presenter.priceNamePrint();
    }
}