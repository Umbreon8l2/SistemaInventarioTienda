package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.MovimientoInventario;

public interface MovimientoInventarioRepository
        extends JpaRepository<MovimientoInventario, Long> {
}
