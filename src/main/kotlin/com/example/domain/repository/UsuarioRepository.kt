package com.example.domain.repository

import com.example.domain.model.Usuario
import io.micronaut.context.annotation.Executable
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface UsuarioRepository : CrudRepository<Usuario, Long> {
    @Executable
    fun find(id: Long): Usuario
}
