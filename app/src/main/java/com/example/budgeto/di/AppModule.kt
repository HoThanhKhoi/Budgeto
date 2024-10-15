package com.example.budgeto.di

import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.AuthRepositoryImplement
import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideFirebaseAuth() = FirebaseAuth.getInstance()

    @Provides
    @Singleton
    fun provideAuthRepositoryImplement(firebaseAuth: FirebaseAuth): AuthRepository {
        return AuthRepositoryImplement(firebaseAuth)
    }

}