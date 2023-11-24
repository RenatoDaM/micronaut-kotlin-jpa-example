package com.example.domain.model

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity
import jakarta.persistence.GenerationType

@Entity
@Serdeable
data class Usuario (
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    val username: String,
    val password: String

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Usuario

        if (id != other.id) return false
        if (username != other.username) return false
        if (password != other.password) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + password.hashCode()
        return result
    }

    override fun toString(): String {
        return "Usuario(id=$id, username='$username', password='$password')"
    }
}


