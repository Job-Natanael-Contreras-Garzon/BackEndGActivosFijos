package com.example.crud.Repository;

import com.example.crud.Models.Cargo;
import com.example.crud.Models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {
}
