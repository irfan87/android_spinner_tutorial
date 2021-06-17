package com.irfanshukri203.spinnertutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customList = listOf("First", "Second", "Third", "Fourth")
        val arrayAdapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, customList)
        spMonth.adapter = arrayAdapter

        spMonth.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,
                    "You have selected ${adapterView?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}