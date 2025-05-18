package br.com.sevenbikes.register.infra.configuration

import br.com.sevenbikes.register.core.gateway.Teste
import br.com.sevenbikes.register.core.useCase.TesteUseCase
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class TesteConfig {

    @Bean
    fun createTesteUseCase(teste: Teste): TesteUseCase{
        return TesteUseCase(teste)
    }
}