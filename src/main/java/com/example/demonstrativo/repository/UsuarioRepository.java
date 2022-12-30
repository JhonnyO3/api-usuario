package com.example.demonstrativo.repository;

import com.example.demonstrativo.dto.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
