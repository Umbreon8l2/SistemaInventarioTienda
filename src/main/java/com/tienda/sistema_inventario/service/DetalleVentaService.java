package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.DetalleVenta;

public interface DetalleVentaService {

    List<DetalleVenta> listar();

    DetalleVenta obtener(Long id);

    DetalleVenta guardar(DetalleVenta detalle);

    void eliminar(Long id);
}
