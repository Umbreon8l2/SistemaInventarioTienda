package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.Compra;
import com.tienda.sistema_inventario.repository.CompraRepository;
import com.tienda.sistema_inventario.service.CompraService;

@Service
public class CompraServiceImpl implements CompraService {

    private final CompraRepository repository;

    public CompraServiceImpl(CompraRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Compra> listar() {
        return repository.findAll();
    }

    @Override
    public Compra obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Compra no encontrada"));
    }

    @Override
    public Compra guardar(Compra compra) {
        return repository.save(compra);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
