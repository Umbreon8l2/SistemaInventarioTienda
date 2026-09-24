package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
