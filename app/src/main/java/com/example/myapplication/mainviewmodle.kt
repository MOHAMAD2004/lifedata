package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodle:ViewModel() {
    override fun onCleared() {
        super.onCleared()
    }
    val score=MutableLiveData<Int>()
    fun add(a:Int){
        score.value=a
        score.value=(score.value)?.plus(1)
    }
}