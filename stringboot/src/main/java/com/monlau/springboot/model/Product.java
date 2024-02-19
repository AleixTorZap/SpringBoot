package com.monlau.springboot.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_gen")
    @SequenceGenerator(name = "product_gen", sequenceName = "hibernate_sequence", allocationSize=1)
    private Integer id_product;
    private String name;
    private float price;
    private String description;

    @OneToMany(mappedBy = "producto")
    @JsonIgnore
    private Collection<Detalle> pedidos;
}