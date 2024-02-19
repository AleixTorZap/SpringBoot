package com.monlau.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.monlau.springboot.model.Detalle;

@Repository
public interface RepositoryDetalle extends JpaRepository<Detalle, Integer> {
}
