package com.cyriltheandroid.myfragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), FragmentRed.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        val fragmentRed = FragmentRed()
        fragmentRed.listener = this

        transaction.run {
            add(R.id.my_fragment_container_view, fragmentRed)
            addToBackStack(null)
            commit()
        }
    }

    override fun onClick(name: String) {
        Log.d("MainActivity", "Name is $name")
    }
}