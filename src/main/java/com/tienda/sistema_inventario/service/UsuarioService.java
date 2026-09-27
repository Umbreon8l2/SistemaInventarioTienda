package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Usuario;

public interface UsuarioService {

    List<Usuario> listar();

    Usuario obtener(Long id);

    Usuario guardar(Usuario usuario);

    Usuario actualizar(Long id, Usuario usuario);

    void eliminar(Long id);
}
