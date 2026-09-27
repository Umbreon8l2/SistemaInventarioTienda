package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
