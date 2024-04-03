package com.maksimyurau.android.lab5_notes.viewmodel

import androidx.lifecycle.ViewModel
import com.maksimyurau.android.lab5_notes.data.repository.Repository

/**
 * Модель просмотра, используемая для хранения глобального состояния приложения.
 *
 * Эта модель просмотра используется для всех экранов.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

}
