package com.example.fragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


val frag2 = SecondFragment()


        binding.apply {
            fragment1Btn.setOnClickListener(){
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.Form, testFragment())
                     addToBackStack(null)
                    commit()
                }
            }


            fragment2Btn.setOnClickListener(){
                val bundle = Bundle()
                bundle.putString("String","LALALAALA")
                frag2.arguments= bundle
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.Form, frag2)
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}