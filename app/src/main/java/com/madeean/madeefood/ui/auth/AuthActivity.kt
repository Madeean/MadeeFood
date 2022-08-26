package com.madeean.madeefood.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.madeean.madeefood.R

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val pageRequest = intent.getIntExtra("page_request",0)
        if(pageRequest == 2){
            val navOption = NavOptions.Builder().setPopUpTo(R.id.fragmentSignIn, true).build()

            Navigation.findNavController(findViewById(R.id.authHostFragment)).navigate(R.id.action_signup, null, navOption)
        }
    }
}