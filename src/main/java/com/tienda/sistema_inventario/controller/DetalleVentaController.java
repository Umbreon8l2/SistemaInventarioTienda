package com.tienda.sistema_inventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.sistema_inventario.entity.DetalleVenta;
import com.tienda.sistema_inventario.service.DetalleVentaService;

@RestController
@RequestMapping("/api/detalles-venta")
public class DetalleVentaController {

    private final DetalleVentaService service;

    public DetalleVentaController(
            DetalleVentaService service) {

        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DetalleVenta>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> obtener(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                service.obtener(id)
        );
    }

    @PostMapping
    public ResponseEntity<DetalleVenta> guardar(
            @RequestBody DetalleVenta detalle) {

        return ResponseEntity.ok(
                service.guardar(detalle)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(
            @PathVariable Long id) {

        service.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}
