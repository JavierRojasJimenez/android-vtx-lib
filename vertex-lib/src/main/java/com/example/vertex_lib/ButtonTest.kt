package com.example.vertex_lib

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.android.volley.Request
import com.android.volley.Response


class ButtonTest @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context).inflate(R.layout.component_btn1, this, true)
        val btn = findViewById<Button>(R.id.btn1)
        //val txtRequest = findViewById<TextView>(R.id.text_request)
        var message1: String = "Mensaje de prueba desde libreria"
        // var message2: String = "Hola Mundo"

        //val requestQueue = Volley.newRequestQueue(context)
        //val url = "http://www.google.com"

        //val stringRequest = StringRequest(Request.Method.GET, url,
        //    Response.Listener<String> { response ->
        //        message2 = "r: ${response}"
        //    },
        //    Response.ErrorListener { error ->
        //        message2 = "r: ${error}"
        //    })


        //requestQueue.add(stringRequest)


        btn.setOnClickListener { Toast.makeText(context, message1, Toast.LENGTH_SHORT).show() }
        //txtRequest.text = message2
    }
}