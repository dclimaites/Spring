package br.com.fiap.kotlinwebflux.controller

import br.com.fiap.kotlinwebflux.dto.PessoaDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class PessoaController {
    @GetMapping
    fun getPessoas(): Flux<PessoaDTO> = Flux.create{

        it.next(PessoaDTO(id = 1, cpf = "123", nome = "Fabio"));
        it.next(PessoaDTO(id = 2, cpf = "321", nome = "maria"));
        it.complete();
    }
}
