package io.github.drumber.kitsune.di

import io.github.drumber.kitsune.ui.main.MainActivityViewModel
import io.github.drumber.kitsune.ui.main.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainActivityViewModel() }
    viewModel { MainFragmentViewModel(get()) }
}