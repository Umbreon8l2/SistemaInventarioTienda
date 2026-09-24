package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.Venta;
import com.tienda.sistema_inventario.repository.VentaRepository;
import com.tienda.sistema_inventario.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {

    private final VentaRepository repository;

    public VentaServiceImpl(VentaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Venta> listar() {
        return repository.findAll();
    }

    @Override
    public Venta obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Venta no encontrada"));
    }

    @Override
    public Venta guardar(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
