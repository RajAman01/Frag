package com.rajaman.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class frag2Act:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root:View = inflater.inflate(R.layout.frag2act,container,false)
        val btn = root.findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            Toast.makeText(context,"Hello I'm Hero",Toast.LENGTH_LONG).show()
        }
        return root
    }
}