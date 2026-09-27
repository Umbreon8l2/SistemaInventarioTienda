package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}
