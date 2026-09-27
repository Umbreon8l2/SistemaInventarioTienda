package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Categoria;

public interface CategoriaService {

    List<Categoria> listar();

    Categoria obtener(Long id);

    Categoria guardar(Categoria categoria);

    Categoria actualizar(Long id, Categoria categoria);

    void eliminar(Long id);
}
