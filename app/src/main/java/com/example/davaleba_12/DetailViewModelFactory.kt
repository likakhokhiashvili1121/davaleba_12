package com.example.davaleba_12

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DetailViewModelFactory(private val application: Application, private val sports: Sports) :
    ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(application, sports) as T
        }
        throw IllegalArgumentException("Cannot create instance for DetailViewModel class")
    }
}