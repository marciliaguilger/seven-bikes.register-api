package br.com.sevenbikes.register.adapter.controller

import br.com.sevenbikes.register.core.useCase.TesteUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TesteController(
    private val teste: TesteUseCase
) {

    @GetMapping("/")
    fun create(){
        teste.create()
    }

}