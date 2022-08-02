package com.example.appproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.ShareViewModel

abstract class BaseFragment : Fragment() {

    lateinit var state: ShareViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        state = ViewModelProvider(requireActivity()).get(ShareViewModel::class.java)

        state.loginState.observe(viewLifecycleOwner, object : Observer<User?> {
            override fun onChanged(t: User?) {
                if (t == null) {
                    onLogout()
                } else {
                    onLogin(t)
                }
            }
        })
    }

    abstract fun onLogin(user: User)

    abstract fun onLogout()


}