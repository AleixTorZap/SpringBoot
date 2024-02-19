package com.monlau.springboot.service;

import com.monlau.springboot.model.Pedido;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.monlau.springboot.repository.RepositoryPedido;
import java.util.List;

@Service
public class ServicePedido {
    @Autowired
    private RepositoryPedido orderRepository;

    public List<Pedido> listPedidos() { return orderRepository.findAll(); }
   public Pedido findPedidoById(Integer id) { return orderRepository.findById(id).get(); }
}
