package com.monlau.springboot.service;//package com.monlau.springboot.service;

import com.monlau.springboot.model.Pedido;
import com.monlau.springboot.model.Product;
import com.monlau.springboot.repository.RepositoryProduct;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ServiceProduct {
    @Autowired
    private RepositoryProduct orderRepository;

    public List<Product> listProduct() { return orderRepository.findAll(); }

    public Product findProductById(Integer id) { return orderRepository.findById(id).get(); }




}

