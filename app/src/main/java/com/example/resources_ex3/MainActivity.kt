package com.example.resources_ex3

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text= findViewById<TextView>(R.id.textView)

        val btn_click= findViewById<Button>(R.id.btn_click)
        btn_click.setOnClickListener {
            text.setBackgroundColor(resources.getColor(R.color.yellow))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_exit -> Toast.makeText(this,"Action Exit selected",Toast.LENGTH_LONG).show()

            R.id.action_settings -> Toast.makeText(this,"Action Settings selected",Toast.LENGTH_LONG).show()

            R.id.action_share -> Toast.makeText(this,"Action Share selected",Toast.LENGTH_LONG).show()



        }
        return super.onOptionsItemSelected(item)
    }
}