package com.monlau.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_gen")
    @SequenceGenerator(name = "detalle_gen", sequenceName = "hibernate_sequence", allocationSize=1)

    private Integer id_detalle;

    @ManyToOne
    @JoinColumn(name="id_producto")
    Product producto;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="id_pedido")
    Pedido pedido;

    private Integer cantidad;
    private Double precio_unitario;
}
