package com.artisoft.navigationcomponent.Fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.artisoft.navigationcomponent.R
import com.artisoft.navigationcomponent.databinding.FragmentHomeBinding


class HomeFragment : Fragment(com.artisoft.navigationcomponent.R.layout.fragment_home) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.textView) as TextView
        object : CountDownTimer(30000, 1000) {

            // Callback function, fired on regular interval
            override fun onTick(millisUntilFinished: Long) {
               textView.setText("seconds remaining: " + millisUntilFinished / 1000)
            }

            // Callback function, fired
            // when the time is up
            override fun onFinish() {
                textView.setText("done!")
            }
        }.start()



    }
}