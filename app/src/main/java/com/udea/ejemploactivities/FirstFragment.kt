package com.udea.ejemploactivities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class FirstFragment : Fragment() {
    val args: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)



         view.findViewById<TextView>(R.id.textView).setOnClickListener{
             var numero = view.findViewById<TextView>(R.id.editTextNumber).text.toString()
             val action =FirstFragmentDirections.actionFirstFragmentToSecondFragment(numero.toInt())
             Navigation.findNavController(view).navigate(action)}

        return view
    }
}