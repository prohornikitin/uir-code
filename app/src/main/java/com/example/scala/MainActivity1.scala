package com.example.scala

import android.app.Activity
import android.os.Bundle


class MainActivity1 extends Activity() {
    override def onCreate(savedInstanceState: Bundle | Null): Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}