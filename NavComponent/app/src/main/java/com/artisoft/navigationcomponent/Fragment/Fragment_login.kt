package com.artisoft.navigationcomponent.Fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.artisoft.navigationcomponent.R

class Fragment_login : Fragment(R.layout.fragment_login) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button2: Button = view.findViewById(com.artisoft.navigationcomponent.R.id.gobtn)
        val buttonlogin: Button = view.findViewById(com.artisoft.navigationcomponent.R.id.loginbtn)
        button2.setOnClickListener {

            findNavController().navigate(R.id.action_fragment_login_to_fragment_home23)
        }
        buttonlogin.setOnClickListener {

            findNavController().navigate(R.id.action_fragment_login_to_welcomeFragment)
        }


    }
}