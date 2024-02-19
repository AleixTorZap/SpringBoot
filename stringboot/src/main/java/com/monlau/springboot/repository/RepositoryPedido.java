package com.monlau.springboot.repository;
import com.monlau.springboot.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPedido extends JpaRepository<Pedido, Integer> {
}
