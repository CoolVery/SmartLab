package com.example.smartlab.viewmodelmain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.smartlab.api.Repository
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class ViewModelMain(private val repository: Repository): ViewModel() {
    private val _showErrorToastChannel = Channel<Boolean>()
    val showErrorToastChannel = _showErrorToastChannel.receiveAsFlow()

    fun sendCodeToEmail(email: String) {
        viewModelScope.launch {
            repository.sendCodeEmail(email).collect {
                when (it) {
                    is com.example.smartlab.api.Result.Error -> {
                        _showErrorToastChannel.send(true)
                    }

                    is com.example.smartlab.api.Result.Success -> {
                        _showErrorToastChannel.send(false)
                    }
                }
            }
        }
    }
    fun checkCodeInEmail(
        email: String?,
        code: String,
        acthion: () -> Unit) {
        viewModelScope.launch {
            repository.checkCodeInEmail(email, code).collect {
                when (it) {
                    is com.example.smartlab.api.Result.Error -> {
                        _showErrorToastChannel.send(true)
                    }

                    is com.example.smartlab.api.Result.Success -> {
                        acthion()
                        _showErrorToastChannel.send(false)

                    }
                }
            }

        }
    }
}
