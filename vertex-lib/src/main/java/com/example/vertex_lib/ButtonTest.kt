package com.example.vertex_lib

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast


class ButtonTest @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context).inflate(R.layout.component_btn1, this, true)
        val btn = findViewById<Button>(R.id.btn1)
        var message1: String = "Mensaje de prueba desde libreria"

        btn.setOnClickListener {
            Toast.makeText(context, message1, Toast.LENGTH_SHORT).show()
            val intent = Intent(context, catalog::class.java)
            context.startActivity(intent)
        }

    }
}