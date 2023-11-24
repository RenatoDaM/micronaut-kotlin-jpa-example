package com.example.domain

import com.example.domain.model.Usuario
import com.example.domain.repository.UsuarioRepository
import io.micronaut.core.annotation.NonNull
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.hibernate.service.spi.InjectService

@Singleton
class UsuarioService (){
    @Inject
    lateinit var usuarioRepository: UsuarioRepository

    fun doStuff(username: String, password: String): @NonNull Usuario? {
        var usuario = Usuario(username = username, password = password)
        return usuarioRepository.save(usuario)
    }
}

