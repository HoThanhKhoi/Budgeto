package com.example.budgeto.di

import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.AuthRepositoryImplement
import com.example.budgeto.data.repository.dailySummary.DailySummaryRepository
import com.example.budgeto.data.repository.transaction.TransactionRepository
import com.example.budgeto.data.repository.user.UserRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
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
    fun provideFirebaseFirestore() = FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideAuthRepositoryImplement(firebaseAuth: FirebaseAuth): AuthRepository {
        return AuthRepositoryImplement(firebaseAuth)
    }

    @Provides
    @Singleton
    fun provideUserRepository(firestore: FirebaseFirestore):UserRepository{
        return UserRepository(firestore)
    }

    @Provides
    @Singleton
    fun provideDailySummaryRepository(firestore: FirebaseFirestore, userRepository: UserRepository): DailySummaryRepository {
        return DailySummaryRepository(firestore, userRepository)
    }

    @Provides
    @Singleton
    fun provideTransactionRepository(firestore: FirebaseFirestore, userRepository: UserRepository): TransactionRepository {
        return TransactionRepository(firestore, userRepository)
    }
}