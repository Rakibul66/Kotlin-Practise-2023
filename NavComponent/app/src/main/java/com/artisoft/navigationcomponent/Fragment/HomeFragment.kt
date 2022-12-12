package com.artisoft.navigationcomponent.Fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.artisoft.navigationcomponent.R


class HomeFragment : Fragment(com.artisoft.navigationcomponent.R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button = view.findViewById(com.artisoft.navigationcomponent.R.id.btn_login)
        button.setOnClickListener {

            findNavController().navigate(R.id.action_fragment_home2_to_fragment_login)
        }


    }
}