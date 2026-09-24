package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.MetodoPago;

public interface MetodoPagoService {

    List<MetodoPago> listar();

    MetodoPago guardar(MetodoPago metodoPago);

    void eliminar(Long id);
}
