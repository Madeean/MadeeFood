package com.madeean.madeefood.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.madeean.madeefood.R
import com.madeean.madeefood.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signin.*


class SigninFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSignup.setOnClickListener{
            val signup = Intent(activity, AuthActivity::class.java)
            signup.putExtra("page_request",2)
            startActivity(signup)
        }
    }


}