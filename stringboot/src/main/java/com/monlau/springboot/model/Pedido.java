package com.monlau.springboot.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_gen")
    @SequenceGenerator(name = "pedido_gen", sequenceName = "hibernate_sequence", allocationSize=1)
    private Integer id_pedido;
    private LocalDateTime fecha_pedido;

    // 1:M: Un pedido puede tener varios detalles
    @OneToMany(mappedBy = "pedido")
    private Collection<Detalle> registrations;
}