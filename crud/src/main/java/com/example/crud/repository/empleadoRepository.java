package com.example.crud.repository;

import com.example.crud.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empleadoRepository extends JpaRepository<Empleado, Long>
{
}
