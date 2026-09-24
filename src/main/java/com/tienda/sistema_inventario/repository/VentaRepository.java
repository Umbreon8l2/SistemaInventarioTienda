package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
