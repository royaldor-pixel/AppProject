package com.example.appproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.ShareViewModel

abstract class BaseFragment : Fragment() {

    private lateinit var state: ShareViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        state = ViewModelProvider(requireActivity())[ShareViewModel::class.java]

        state.loginState.observe(
            viewLifecycleOwner
        ) { t ->
            if (t == null) {
                onLogout()
            }
            else {
                onLogin(t)
            }
        }
    }

    abstract fun onLogin(user: User)

    abstract fun onLogout()


}