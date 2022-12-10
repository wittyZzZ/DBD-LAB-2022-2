package com.dbdgrupo16.demo.service.impl;

import com.dbdgrupo16.demo.models.Pedido;
import com.dbdgrupo16.demo.repository.PedidoRepository;
import com.dbdgrupo16.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido crearPedido(Pedido pedido) {return pedidoRepository.save(pedido);}
    @Override
    public Pedido actualizarPedido(Pedido pedido) {return pedidoRepository.save(pedido);}
    @Override
    public List<Pedido> getAllPedidos() {
        return (List<Pedido>) pedidoRepository.findAll();
    }
    @Override
    public Pedido getPedidoById(Integer id_pedido) {
        return pedidoRepository.findById(id_pedido).orElse(null);
    }
    @Override
    public Pedido eliminarPedido(Integer id_pedido) throws Exception {
        Pedido deletedPedido = null;
        try {
            deletedPedido = pedidoRepository.findById(id_pedido).orElse(null);
            if(deletedPedido == null) {
                throw new Exception("Pedido no disponible");
            }else {
                pedidoRepository.deleteById(id_pedido);
            }
        } catch(Exception ex) {
            throw ex;
        }
        return deletedPedido;
    }
}
