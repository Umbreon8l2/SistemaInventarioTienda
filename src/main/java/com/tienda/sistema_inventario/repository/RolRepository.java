package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
