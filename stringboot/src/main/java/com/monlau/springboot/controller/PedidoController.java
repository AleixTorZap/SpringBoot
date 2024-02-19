package com.monlau.springboot.controller;

import com.monlau.springboot.model.Pedido;
import com.monlau.springboot.service.ServicePedido;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author user
 */
@RestController
@RequiredArgsConstructor
public class PedidoController {

    @Autowired
    private final ServicePedido servicePedido;


    @GetMapping("/Pedido")
    public List<Pedido> listProducts() {
        return servicePedido.listPedidos();
    }
    @GetMapping("/Pedido/{id_pedido}")
    public ResponseEntity<Pedido> getProduct(@PathVariable Integer id){
        try{
            Pedido pedido = servicePedido.findPedidoById(id);
            return ResponseEntity.ok(pedido);
        }
        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}