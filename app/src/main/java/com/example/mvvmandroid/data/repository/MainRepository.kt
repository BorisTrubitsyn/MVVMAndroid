package com.example.mvvmandroid.data.repository

import com.example.mvvmandroid.data.api.ApiHelper
import com.example.mvvmandroid.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}