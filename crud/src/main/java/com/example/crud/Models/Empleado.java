package com.example.crud.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table
@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEmpleado;
    @Column(nullable = false)
    private String apellido;
    @Column( nullable = false)
    private String nombre;
    @ManyToOne
    @JoinColumn(nullable = false)
     private Rol idrol;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Departamento idDepartamento;
    @OneToOne
    @JoinColumn(nullable = false)
    private Cargo idcargo;

}
