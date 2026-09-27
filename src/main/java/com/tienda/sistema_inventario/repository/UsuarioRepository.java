package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
