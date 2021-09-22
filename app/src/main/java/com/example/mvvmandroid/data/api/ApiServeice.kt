package com.example.mvvmandroid.data.api

import com.example.mvvmandroid.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}