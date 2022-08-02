package com.example.appproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appproject.ui.User
import com.example.wanandroidapi.NetData
import com.example.wanandroidapi.NetResult
import com.example.wanandroidapi.repository.AccountRepository

class ShareViewModel : ViewModel(){

    private val loginStatePri = MutableLiveData<User?>()
    val loginState : LiveData<User?> = loginStatePri

    fun login(name: String, pwd: String) {
        AccountRepository.login(name, pwd, object : NetResult<User>{
            override fun onResult(netData: NetData<User>) {
                if (netData.errorCode == 0 && netData.data != null) {
                    loginStatePri.postValue(netData.data)
                    return
                }
                loginStatePri.postValue(null)
            }

        })
    }

    fun logout() {
        AccountRepository.logout(object : NetResult<Any>{
            override fun onResult(netData: NetData<Any>) {
                if (netData.errorCode == 0) {
                    loginStatePri.postValue(null)
                }
            }

        })
    }

}