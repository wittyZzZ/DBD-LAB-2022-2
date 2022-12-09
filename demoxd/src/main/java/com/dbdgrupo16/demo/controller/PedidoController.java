package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Pedido;
import com.dbdgrupo16.demo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    @GetMapping("/allPedido")
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        List<Pedido> pedidos = null;
        try {
            pedidos = pedidoService.getAllPedidos();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Pedido>>(pedidos,HttpStatus.OK);
    }

    @GetMapping("/getById/{id_pedido}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable("id_pedido") Integer id_pedido) {
        Pedido pedidos = null;
        try {
            pedidos = pedidoService.getPedidoById(id_pedido);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedidos,HttpStatus.OK);
    }
    @PostMapping("/crearoActualizar")
    public ResponseEntity<Pedido> crearActualizarPedido(@RequestBody Pedido pedido){
        Pedido pedidos = null;
        try {
            pedidos = pedidoService.crearActualizarPedido(pedido);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedidos,HttpStatus.OK);
    }
    @DeleteMapping("/eliminar/{id_pedido}")
    public ResponseEntity<Pedido> eliminarPedido(@PathVariable("id_pedido") Integer id_pedido){
        Pedido pedidos = null;
        try {
            pedidos = pedidoService.eliminarPedido(id_pedido);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedidos,HttpStatus.OK);
    }
}