package com.tienda.sistema_inventario.service.impl;

import com.tienda.sistema_inventario.entity.DetalleVenta;
import com.tienda.sistema_inventario.repository.DetalleVentaRepository;
import com.tienda.sistema_inventario.service.DetalleVentaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    private final DetalleVentaRepository repository;

    public DetalleVentaServiceImpl(
            DetalleVentaRepository repository) {

        this.repository = repository;
    }

    @Override
    public List<DetalleVenta> listar() {
        return repository.findAll();
    }

    @Override
    public DetalleVenta obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Detalle de venta no encontrado"));
    }

    @Override
    public DetalleVenta guardar(DetalleVenta detalle) {
        return repository.save(detalle);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
