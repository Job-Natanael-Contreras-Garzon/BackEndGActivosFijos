package com.example.crud.repository;

import com.example.crud.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departamentoRepository extends JpaRepository<Departamento, Long> {
}
