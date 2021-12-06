package br.com.douglasmotta.whitelabeltutorial.domain.usecase.di

import br.com.douglasmotta.whitelabeltutorial.domain.usecase.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface DomainModule {

    @Binds
    fun bindCreateProductUserCase(useCaseImpl: CreateProductUseCaseImpl): CreateProductUseCase

    @Binds
    fun bindGetProductUserCase(useCaseImpl: GetProductsUseCaseImpl): GetProductsUseCase

    @Binds
    fun bindUploadImageUserCase(useCaseImpl: UploadProductImageUseCaseImpl): UploadProductImageUseCase
}