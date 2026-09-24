package com.tienda.sistema_inventario.controller;

import com.tienda.sistema_inventario.entity.DetalleCompra;
import com.tienda.sistema_inventario.service.DetalleCompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles-compra")
public class DetalleCompraController {

    private final DetalleCompraService service;

    public DetalleCompraController(DetalleCompraService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DetalleCompra>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCompra> obtener(
            @PathVariable Long id) {

        return ResponseEntity.ok(service.obtener(id));
    }

    @PostMapping
    public ResponseEntity<DetalleCompra> guardar(
            @RequestBody DetalleCompra detalle) {

        return ResponseEntity.ok(service.guardar(detalle));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(
            @PathVariable Long id) {

        service.eliminar(id);

        return ResponseEntity.noContent().build();
    }
}
