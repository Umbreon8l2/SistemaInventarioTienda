package com.tienda.sistema_inventario.service;

import com.tienda.sistema_inventario.entity.MovimientoInventario;

import java.util.List;

public interface InventarioService {

    List<MovimientoInventario> listarMovimientos();

    MovimientoInventario registrarEntrada(
            Long productoId,
            Integer cantidad,
            String motivo
    );

    MovimientoInventario registrarSalida(
            Long productoId,
            Integer cantidad,
            String motivo
    );
}
