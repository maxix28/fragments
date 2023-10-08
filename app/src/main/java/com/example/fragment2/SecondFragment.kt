package com.example.fragment2

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragment2.databinding.FragmentSecondBinding


@Suppress("DEPRECATION")
class SecondFragment : Fragment(R.layout.fragment_second) {
    lateinit var  binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        binding= FragmentSecondBinding.bind(view)
        try{

            val data = arguments?.getString("String")
            binding.text1.text =data.toString()

        }
        catch (e:Exception){
           println("${e.message}")
            binding.text1.text ="NNOOO"
        }

        return view
    }
}