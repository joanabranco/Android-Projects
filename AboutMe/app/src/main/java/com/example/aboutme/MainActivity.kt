package com.example.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName : MyName = MyName("About Joana")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickname(it)
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }*/

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }

    //mostra o nickname no sítio onde tem o texto editável
    private fun addNickname(view: View) {
        /*
        val editText = findViewById<EditText>(R.id.nickname_edit) //nome inserido pelo utilizador
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text) //"onde vai aparecer" o nome inserido

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        */

        binding.apply {
            nicknameText.text = binding.nicknameEdit.text
            myName?.nickname = nicknameEdit.text.toString()
            // Invalidate all binding expressions and request a new rebind to refresh UI:
            invalidateAll() //é recriado com os dados corretos
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}