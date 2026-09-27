package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.Categoria;
import com.tienda.sistema_inventario.repository.CategoriaRepository;
import com.tienda.sistema_inventario.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaServiceImpl(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @Override
    public Categoria obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Categoría no encontrada"));
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public Categoria actualizar(Long id, Categoria categoria) {

        Categoria existente = obtener(id);

        existente.setNombre(categoria.getNombre());
        existente.setDescripcion(categoria.getDescripcion());

        return repository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
