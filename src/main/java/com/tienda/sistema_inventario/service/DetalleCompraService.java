package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.DetalleCompra;

public interface DetalleCompraService {

    List<DetalleCompra> listar();

    DetalleCompra obtener(Long id);

    DetalleCompra guardar(DetalleCompra detalle);

    void eliminar(Long id);
}
