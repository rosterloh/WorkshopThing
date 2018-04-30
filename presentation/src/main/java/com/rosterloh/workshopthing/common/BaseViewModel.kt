package com.rosterloh.workshopthing.common

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {

    val loader: MutableLiveData<Boolean> = MutableLiveData()
}