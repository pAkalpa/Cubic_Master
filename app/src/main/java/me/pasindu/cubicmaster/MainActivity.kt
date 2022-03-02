package me.pasindu.cubicmaster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var teCircumference: EditText? = null
    private var teLength: EditText? = null
    private var tvResult: TextView? = null
    private var btnReset: Button? = null
    private var btnResult: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        teCircumference = findViewById(R.id.circumference)
        teLength = findViewById(R.id.length)
        tvResult = findViewById(R.id.tvResult)
        btnReset = findViewById(R.id.btnReset)
        btnResult = findViewById(R.id.btnResult)
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}