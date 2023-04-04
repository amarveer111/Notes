package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

import android.widget.PopupMenu
import android.widget.Toast


//import kotlinx.android.synthetic.main.activity_main.*

class NoteEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var view: ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_edit)

        // Referencing and Initializing the button
        view = findViewById(R.id.imageView15)

        // Setting onClick behavior to the button
        view.setOnClickListener {
            // Initializing the popup menu and giving the reference as current context
            val popupMenu = PopupMenu(this@NoteEdit, view)

            // Inflating popup menu from popup_menu.xml file
            popupMenu.menuInflater.inflate(R.menu.menu1, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                // Toast message on menu item clicked
                Toast.makeText(this@NoteEdit, "You Clicked " + menuItem.title, Toast.LENGTH_SHORT).show()
                true
            }
            // Showing the popup menu
            popupMenu.show()
        }







    }
}