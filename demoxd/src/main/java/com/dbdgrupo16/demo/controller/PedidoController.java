package com.dbdgrupo16.demo.controller;

import com.dbdgrupo16.demo.models.Pedido;
import com.dbdgrupo16.demo.models.Region;
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

    @GetMapping
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        List<Pedido> pedi = null;
        try {
            pedi = pedidoService.getAllPedidos();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Pedido>>(pedi,HttpStatus.OK);
    }

    @GetMapping("{id_pedido}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable("id_pedido") Integer id_pedido) {
        Pedido pedi = null;
        try {
            pedi = pedidoService.getPedidoById(id_pedido);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedi,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pedido> crearPedido(@RequestBody Pedido pedido){
        Pedido pedi = null;
        try {
            pedi = pedidoService.crearPedido(pedido);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedi,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pedido> actualizarPedido(@RequestBody Pedido pedido){
        Pedido pedi = null;
        try {
            pedi = pedidoService.actualizarPedido(pedido);
        } catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedi,HttpStatus.OK);
    }

    @DeleteMapping("{id_pedido}")
    public ResponseEntity<Pedido> eliminarPedido(@PathVariable("id_pedido") Integer id_pedido){
        Pedido pedi= null;
        try {
            pedi = pedidoService.eliminarPedido(id_pedido);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<Pedido>(pedi,HttpStatus.OK);
    }
}