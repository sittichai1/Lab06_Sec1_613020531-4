package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_two.view.*


class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view =inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFrageTwo.setOnClickListener(){
            val toast =Toast.makeText(context, "click On Fragment Two",Toast.LENGTH_SHORT )
        toast.show()
        }
        return view


    }
}