package com.example.davaleba_12

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class ListViewModel(application: Application): AndroidViewModel(application) {

    private val _sports: MutableLiveData<List<Sports>> = MutableLiveData()
    val sports: MutableLiveData<List<Sports>>
        get() = _sports

    init {
        val sportsList: List<Sports> = Sports.sportsList(application.applicationContext)
        _sports.value = sportsList
    }
}