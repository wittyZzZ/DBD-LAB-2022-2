package com.dbdgrupo16.demo.repository;

import com.dbdgrupo16.demo.models.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido,Integer>

}