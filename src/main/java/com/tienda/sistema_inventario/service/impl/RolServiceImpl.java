package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.Rol;
import com.tienda.sistema_inventario.repository.RolRepository;
import com.tienda.sistema_inventario.service.RolService;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository repository;

    public RolServiceImpl(RolRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Rol> listar() {
        return repository.findAll();
    }

    @Override
    public Rol obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Rol no encontrado"));
    }

    @Override
    public Rol guardar(Rol rol) {
        return repository.save(rol);
    }

    @Override
    public Rol actualizar(Long id, Rol rol) {

        Rol existente = obtener(id);
        existente.setNombre(rol.getNombre());

        return repository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

