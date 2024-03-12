package com.example.scala

import android.app.Activity
import android.os.Bundle
import android.widget.{Button, Toast}
//import com.example.scala.datadinding.MainBinding

class MainActivity extends Activity() {
    override def onCreate(savedInstanceState: Bundle): Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        findViewById(R.id.btn).asInstanceOf[Button].setOnClickListener(_ -> {
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
        })
//        var binding = MainBinding.inflate(getLayoutInflater)
//        setContentView(binding.root)
    }
}