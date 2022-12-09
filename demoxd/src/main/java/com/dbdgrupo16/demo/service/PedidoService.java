package com.dbdgrupo16.demo.service;

import com.dbdgrupo16.demo.models.Pedido;
import java.util.List;

public interface PedidoService {
    // Create/Update
    public Pedido crearActualizarPedido(Pedido pedido);

    // Read
    public List<Pedido> getAllPedidos();

    // Read
    public Pedido getPedidoById(Integer id_pedido);

    // Delete
    public Pedido eliminarPedido(Integer id_pedido) throws Exception;
}
