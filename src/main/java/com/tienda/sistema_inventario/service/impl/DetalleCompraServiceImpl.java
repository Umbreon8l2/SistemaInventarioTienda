package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.DetalleCompra;
import com.tienda.sistema_inventario.repository.DetalleCompraRepository;
import com.tienda.sistema_inventario.service.DetalleCompraService;

@Service
public class DetalleCompraServiceImpl implements DetalleCompraService {

    private final DetalleCompraRepository repository;

    public DetalleCompraServiceImpl(DetalleCompraRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DetalleCompra> listar() {
        return repository.findAll();
    }

    @Override
    public DetalleCompra obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Detalle de compra no encontrado"));
    }

    @Override
    public DetalleCompra guardar(DetalleCompra detalle) {
        return repository.save(detalle);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
