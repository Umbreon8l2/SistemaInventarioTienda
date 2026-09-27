package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tienda.sistema_inventario.entity.Proveedor;
import com.tienda.sistema_inventario.repository.ProveedorRepository;
import com.tienda.sistema_inventario.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repository;

    public ProveedorServiceImpl(ProveedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Proveedor> listar() {
        return repository.findAll();
    }

    @Override
    public Proveedor obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Proveedor no encontrado"));
    }

    @Override
    public Proveedor guardar(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public Proveedor actualizar(Long id, Proveedor proveedor) {

        Proveedor existente = obtener(id);

        existente.setNombre(proveedor.getNombre());
        existente.setRuc(proveedor.getRuc());
        existente.setTelefono(proveedor.getTelefono());
        existente.setEmail(proveedor.getEmail());
        existente.setDireccion(proveedor.getDireccion());

        return repository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
