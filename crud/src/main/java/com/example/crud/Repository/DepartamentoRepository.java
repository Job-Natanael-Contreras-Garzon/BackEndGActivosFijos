package com.example.crud.Repository;

import com.example.crud.Models.Cargo;
import com.example.crud.Models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
}
