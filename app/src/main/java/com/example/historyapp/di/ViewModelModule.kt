package com.example.historyapp.di

import com.example.historyapp.ui.fragment.history.HistoryViewModel
import com.example.historyapp.ui.fragment.historyDetail.HistoryDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {
    viewModel {
        HistoryViewModel(get())
    }
    viewModel {
        HistoryDetailViewModel(get())
    }
}