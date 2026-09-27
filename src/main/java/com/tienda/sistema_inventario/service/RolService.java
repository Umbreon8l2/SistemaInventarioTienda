package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Rol;

public interface RolService {

    List<Rol> listar();

    Rol obtener(Long id);

    Rol guardar(Rol rol);

    Rol actualizar(Long id, Rol rol);

    void eliminar(Long id);
}
