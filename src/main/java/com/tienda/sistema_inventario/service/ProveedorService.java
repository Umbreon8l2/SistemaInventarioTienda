package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Proveedor;

public interface ProveedorService {

    List<Proveedor> listar();

    Proveedor obtener(Long id);

    Proveedor guardar(Proveedor proveedor);

    Proveedor actualizar(Long id, Proveedor proveedor);

    void eliminar(Long id);
}
