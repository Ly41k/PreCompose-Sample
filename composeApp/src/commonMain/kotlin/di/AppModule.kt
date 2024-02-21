package di

import data.MockDataRepository
import data.MockDataRepositoryImpl
import org.koin.dsl.module

fun appModule() = module {
    single<MockDataRepository> { MockDataRepositoryImpl() }
}
