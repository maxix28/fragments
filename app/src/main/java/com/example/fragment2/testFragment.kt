package com.example.fragment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment2.databinding.FragmentTestBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [testFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class testFragment : Fragment() {

lateinit var  binding : FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
 val view = inflater.inflate(R.layout.fragment_test, container, false)
binding = FragmentTestBinding.bind(view)
val frag2 =SecondFragment()
        binding.button2.setOnClickListener {
            val text = binding.Input2.text.toString()
val bundle = Bundle()
            bundle.putString("String", text)
            frag2.arguments= bundle
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.Form, frag2)
                addToBackStack(null)
                commit()
            }
        }
        return view
    }


}