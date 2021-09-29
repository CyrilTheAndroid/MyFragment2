package com.cyriltheandroid.myfragment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FragmentRed : Fragment() {

    interface OnClickListener {
        fun onClick(name: String)
    }

    var listener: OnClickListener? = null
    lateinit var editText: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button)
        editText = view.findViewById(R.id.edit_text)
        button.setOnClickListener {
            val name = editText.text.toString()
            listener?.onClick(name)
        }
    }
}