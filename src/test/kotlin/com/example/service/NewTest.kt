package com.example.service

import com.example.domain.UsuarioService
import com.example.domain.model.Usuario
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test

@MicronautTest
open class UsuarioRepositoryTest {
    @Inject
    lateinit var usuarioService: UsuarioService
    var aluno = Usuario(1, "2", "asd")

    @Test
    @Order(1)
    open fun testSave() {

        // Given
        var usuario = Usuario(id = 1, username = "John Doe", password = "john@example.com")
        println("salve")
        // When
        var savedUsuario = usuarioService.doStuff( username = "John Doe", password = "john@example.com")
        println(savedUsuario)
        if (savedUsuario != null) {
            Assertions.assertEquals(savedUsuario.username, "John Doe")
            Assertions.assertEquals(savedUsuario.password, "john@example.com")
        }
    }

    @Test
    @Order(2)
    open fun test2() {
        Assertions.assertEquals(1, 1)
    }
}