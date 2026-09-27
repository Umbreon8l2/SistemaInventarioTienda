package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Venta;

public interface VentaService {

    List<Venta> listar();

    Venta obtener(Long id);

    Venta guardar(Venta venta);

    void eliminar(Long id);
}

