package com.tienda.sistema_inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.sistema_inventario.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
