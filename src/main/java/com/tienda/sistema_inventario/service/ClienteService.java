package com.tienda.sistema_inventario.service;

import java.util.List;

import com.tienda.sistema_inventario.entity.Cliente;

public interface ClienteService {

    List<Cliente> listar();

    Cliente obtener(Long id);

    Cliente guardar(Cliente cliente);

    Cliente actualizar(Long id, Cliente cliente);

    void eliminar(Long id);
}
