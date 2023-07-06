package dev.`val`.fibonacci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.`val`.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayNamesList()
    }
    fun displayNamesList(){
        val names= listOf("Mary","Akech","Valary","Ziporah","Rita","Nyambu","Grace","Eunice",
            "Musenyia","Joyce","Atong","Masian","Mercy","Parkire","Eliza","Kevine","val","Apiu","Esther","Winnie","Alice")
        binding.rvNames.layoutManager=LinearLayoutManager(this)
        val namesAdapter=NamesRvAdapter(names)  //INSTANTIATE AN ADAPTER.
        binding.rvNames.adapter=namesAdapter
    }
    }