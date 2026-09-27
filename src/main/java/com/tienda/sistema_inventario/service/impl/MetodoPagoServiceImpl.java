package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.MetodoPago;
import com.tienda.sistema_inventario.repository.MetodoPagoRepository;
import com.tienda.sistema_inventario.service.MetodoPagoService;

@Service
public class MetodoPagoServiceImpl implements MetodoPagoService {

    private final MetodoPagoRepository repository;

    public MetodoPagoServiceImpl(MetodoPagoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MetodoPago> listar() {
        return repository.findAll();
    }

    @Override
    public MetodoPago guardar(MetodoPago metodoPago) {
        return repository.save(metodoPago);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
