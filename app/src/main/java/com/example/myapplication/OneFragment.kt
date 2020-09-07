package com.example.myapplication

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.FragmentTransitionImpl
import kotlinx.android.synthetic.main.fragment_one.view.*


class OneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view  = inflater.inflate(R.layout.fragment_one, container, false)
        view.btnClickFrageOne.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = TwoFragment()
            replaceFragment(fragment)

        }
        return view
    }


        fun replaceFragment(someFragment: Fragment){
            val transection: FragmentTransaction = fragmentManager!!.beginTransaction()
            transection.replace(R.id.frameLayout, someFragment)
            transection.addToBackStack(null)
            transection.commit()
    }
}