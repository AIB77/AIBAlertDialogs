package com.example.aibalertdialogs

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var BTN:Button
    var messages = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BTN=findViewById(R.id.thebutton)


        BTN.setOnClickListener {

            customAlert()
        }

    }

    private fun customAlert() {
        // first we create a variable to hold an AlertDialog builder
        val dialogBuilder = AlertDialog.Builder(this)
        // then we set up the input

        val input = EditText(this)
      //  val userinput=input.text
     //   val output= TextView(this)
      // output.text=userinput




        // here we set the message of our alert dialog
        dialogBuilder.setMessage("Enter your message:")
            // positive button text and action
            .setTitle("hi")

            .setPositiveButton("Submit", DialogInterface.OnClickListener {

                    dialog, id -> dialog.apply {
                val input = EditText(this@MainActivity)
                val userinput=input.text
                val output= TextView(this@MainActivity)
                output.text=userinput
            }
                ///.text=userinput.toString()


            })
            // negative button text and action
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("New Message")
        // add the Edit Text
        alert.setView(input)
        // show alert dialog
        alert.show()
    }
}