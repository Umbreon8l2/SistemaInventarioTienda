package com.tienda.sistema_inventario.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.sistema_inventario.entity.MovimientoInventario;
import com.tienda.sistema_inventario.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private final InventarioService service;

    public InventarioController(InventarioService service) {
        this.service = service;
    }

    @GetMapping("/movimientos")
    public ResponseEntity<List<MovimientoInventario>> movimientos() {
        return ResponseEntity.ok(
                service.listarMovimientos()
        );
    }

    @PostMapping("/entrada")
    public ResponseEntity<MovimientoInventario> entrada(
            @RequestParam Long productoId,
            @RequestParam Integer cantidad,
            @RequestParam String motivo) {

        return ResponseEntity.ok(
                service.registrarEntrada(
                        productoId,
                        cantidad,
                        motivo
                )
        );
    }

    @PostMapping("/salida")
    public ResponseEntity<MovimientoInventario> salida(
            @RequestParam Long productoId,
            @RequestParam Integer cantidad,
            @RequestParam String motivo) {

        return ResponseEntity.ok(
                service.registrarSalida(
                        productoId,
                        cantidad,
                        motivo
                )
        );
    }
}
