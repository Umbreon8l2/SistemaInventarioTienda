package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.MetodoPago;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago, Long> {
}
