package com.example.domain

import com.example.domain.model.Usuario
import io.micronaut.core.annotation.NonNull
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.reactivestreams.Publisher

@Controller("/teste")
class Controller(private val usuarioService: UsuarioService) {
    @Get("/alunos")
    @SingleResult
    fun releasesWithLowLevelClient(): @NonNull Usuario? {
        return usuarioService.doStuff("teste", "eh")
    }
}