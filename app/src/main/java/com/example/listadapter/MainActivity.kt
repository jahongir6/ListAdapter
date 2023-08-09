package com.example.listadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listadapter.adapter.PersonAdapter
import com.example.listadapter.databinding.ActivityMainBinding
import com.example.listadapter.models.Person

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
     var list =  ArrayList<Person>()
    private lateinit var personAdapter: PersonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        personAdapter = PersonAdapter()
        binding.rv.adapter = personAdapter

        personAdapter.submitList(list)
        loadData()

    }

    private fun loadData() {
        for (i in 1..100) {
            list.add(Person("jahongir", 10))
        }
    }
}