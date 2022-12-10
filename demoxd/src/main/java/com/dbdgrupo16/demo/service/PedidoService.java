package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Pedido;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PedidoService {
    // Create
    public Pedido crearPedido(Pedido pedido);

    // Update
    public Pedido actualizarPedido(Pedido pedido);

    // Read
    public List<Pedido> getAllPedidos();

    // Read
    public Pedido getPedidoById(Integer id_pedido);

    // Delete
    public Pedido eliminarPedido(Integer id_pedido) throws Exception;
}
