package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {
}
