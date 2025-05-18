package br.com.sevenbikes.register.core.useCase

import br.com.sevenbikes.register.core.gateway.Teste

class TesteUseCase (
    private val teste: Teste
) {
    fun create() {
        teste.create()
    }
}