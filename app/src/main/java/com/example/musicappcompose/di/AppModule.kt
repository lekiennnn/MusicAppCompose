package com.example.musicappcompose.di

import com.example.musicappcompose.ui.auth.AuthViewModel
import com.google.firebase.auth.FirebaseAuth
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { FirebaseAuth.getInstance() }
    viewModel { AuthViewModel() }
}