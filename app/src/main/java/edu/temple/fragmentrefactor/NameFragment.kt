package edu.temple.fragmentrefactor

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import edu.temple.fragmentrefactor.R.*

class NameFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_name, container, false)
        val displayTextView = layout.findViewById<TextView>(R.id.displayTextView)
        val nameEditText = layout.findViewById<EditText>(R.id.nameEditText)
        val changeButton = layout.findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text
            displayTextView.text = if (name.isNotBlank()){
                "Hello, $name!"
            } else {
                "Please enter your name"
            }

        }

        return layout
    }


}