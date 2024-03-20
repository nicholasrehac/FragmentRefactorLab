package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NameFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false).apply {
            val displayTextView = findViewById<TextView>(R.id.displayTextView)
            val nameEditText = findViewById<EditText>(R.id.nameEditText)
            findViewById<Button>(R.id.changeButton).setOnClickListener {
                displayTextView.text = if(nameEditText.text.isBlank()) {
                    "Please enter your name"
                } else {
                    "Hello, ${nameEditText.text}!"
                }
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            NameFragment()
    }
}