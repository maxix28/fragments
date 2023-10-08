package com.example.fragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment2.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
lateinit var  binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_first, container, false)


            // Inflate the layout for this fragment
          //  val view = inflater.inflate(R.layout.fragment_first, container, false)


            //Restore the fragment's state here

            binding = FragmentFirstBinding.bind(view)

            binding.button.setOnClickListener {
                binding.textView2.text = "WORKS"


        }
        return  view
    }

}