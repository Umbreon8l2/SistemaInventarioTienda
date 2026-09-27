package com.tienda.sistema_inventario.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.sistema_inventario.entity.MovimientoInventario;
import com.tienda.sistema_inventario.entity.Producto;
import com.tienda.sistema_inventario.repository.MovimientoInventarioRepository;
import com.tienda.sistema_inventario.repository.ProductoRepository;
import com.tienda.sistema_inventario.service.InventarioService;

@Service
public class InventarioServiceImpl implements InventarioService {

    private final MovimientoInventarioRepository movimientoRepository;
    private final ProductoRepository productoRepository;

    public InventarioServiceImpl(
            MovimientoInventarioRepository movimientoRepository,
            ProductoRepository productoRepository) {

        this.movimientoRepository = movimientoRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public List<MovimientoInventario> listarMovimientos() {
        return movimientoRepository.findAll();
    }

    @Override
    @Transactional
    public MovimientoInventario registrarEntrada(
            Long productoId,
            Integer cantidad,
            String motivo) {

        Producto producto = obtenerProducto(productoId);

        if (cantidad <= 0) {
            throw new RuntimeException(
                    "La cantidad debe ser mayor que cero");
        }

        producto.setStock(producto.getStock() + cantidad);

        productoRepository.save(producto);

        MovimientoInventario movimiento =
                new MovimientoInventario();

        movimiento.setTipo("ENTRADA");
        movimiento.setCantidad(cantidad);
        movimiento.setMotivo(motivo);
        movimiento.setProducto(producto);

        return movimientoRepository.save(movimiento);
    }

    @Override
    @Transactional
    public MovimientoInventario registrarSalida(
            Long productoId,
            Integer cantidad,
            String motivo) {

        Producto producto = obtenerProducto(productoId);

        if (cantidad <= 0) {
            throw new RuntimeException(
                    "La cantidad debe ser mayor que cero");
        }

        if (producto.getStock() < cantidad) {
            throw new RuntimeException(
                    "Stock insuficiente");
        }

        producto.setStock(producto.getStock() - cantidad);

        productoRepository.save(producto);

        MovimientoInventario movimiento =
                new MovimientoInventario();

        movimiento.setTipo("SALIDA");
        movimiento.setCantidad(cantidad);
        movimiento.setMotivo(motivo);
        movimiento.setProducto(producto);

        return movimientoRepository.save(movimiento);
    }

    private Producto obtenerProducto(Long id) {

        return productoRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Producto no encontrado"));
    }
}
