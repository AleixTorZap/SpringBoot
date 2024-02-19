package com.monlau.springboot.controller;
import com.monlau.springboot.model.Product;
import java.util.List;

import com.monlau.springboot.service.ServiceProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aleixtorzap
 */
@Service
@RestController
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ServiceProduct serviceProduct;




    @GetMapping("/Producto")
    public List<Product> listProducts() { return serviceProduct.listProduct();
    }
    @GetMapping("/Producto/{id_producto}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id_producto){
        try{
            Product product = serviceProduct.findProductById(id_producto);
            return ResponseEntity.ok(product);
        }
        catch (Exception e){
            return ResponseEntity.notFound().build(); //404 not found
        }
    }
}