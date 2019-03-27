package com.realdolmen.cookies.activities

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.realdolmen.cookies.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val mp = MediaPlayer.create (this, R.raw.something_special)
        mp.start ()

        btn_login.setOnClickListener {
            val toast = Toast.makeText(this, "Login was pressed", Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(this, OrderActivity::class.java).apply {  }
            startActivity(intent)
        }
        btn_signup.setOnClickListener {
            val toast = Toast.makeText(this, "Signup was pressed", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}
