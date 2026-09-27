package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Compra;

public interface CompraService {

    List<Compra> listar();

    Compra obtener(Long id);

    Compra guardar(Compra compra);

    void eliminar(Long id);
}
