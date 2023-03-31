package com.example.passdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.passdata.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var bindingThird: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingThird = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(bindingThird.root)

        bindingThird.btnBack3.setOnClickListener {
            finish()
        }

    }
}