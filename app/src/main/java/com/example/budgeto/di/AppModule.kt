package com.example.budgeto.di

import com.example.budgeto.data.AuthRepository
import com.example.budgeto.data.AuthRepositoryImplement
import com.example.budgeto.data.repository.dailySummary.DailySummaryRepository
import com.example.budgeto.data.repository.transaction.TransactionRepository
import com.example.budgeto.data.repository.user.UserGameInfoRepository
import com.example.budgeto.data.repository.user.UserGeneralInfoRepository
import com.example.budgeto.data.repository.user.UserMoneyInfoRepository
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
    fun provideUserRepository(firestore: FirebaseFirestore): UserRepository {
        return UserRepository(firestore)
    }

    @Provides
    @Singleton
    fun provideUserGeneralInfoRepository(firestore: FirebaseFirestore): UserGeneralInfoRepository {
        return UserGeneralInfoRepository(firestore)
    }

    @Provides
    @Singleton
    fun provideUserGameInfoRepository(firestore: FirebaseFirestore): UserGameInfoRepository {
        return UserGameInfoRepository(firestore)
    }

    @Provides
    @Singleton
    fun provideUserMoneyInfoRepository(firestore: FirebaseFirestore): UserMoneyInfoRepository {
        return UserMoneyInfoRepository(firestore)
    }

    @Provides
    @Singleton
    fun provideDailySummaryRepository(
        firestore: FirebaseFirestore,
        userRepository: UserRepository
    ): DailySummaryRepository {
        return DailySummaryRepository(firestore, userRepository)
    }

    @Provides
    @Singleton
    fun provideTransactionRepository(
        firestore: FirebaseFirestore,
        userRepository: UserRepository
    ): TransactionRepository {
        return TransactionRepository(firestore, userRepository)
    }


}