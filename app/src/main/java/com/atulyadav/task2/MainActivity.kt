package com.atulyadav.task2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       signup.setOnClickListener {
            val firstName = et_firstname.text.toString()
            val lastName = et_lastname.text.toString()
            val number = et_number.text.toString()
            val email = et_email.text.toString()
            val password = et_password.text.toString()



        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            FirebaseAuth.getInstance().signInWithCredential(firstName, lastName, number)
        startActivity(Intent(this, ChatActivity::class.java))


    }
}
}

private fun FirebaseAuth.signInWithCredential(firstName: String, lastName: String, number: String) {

}
