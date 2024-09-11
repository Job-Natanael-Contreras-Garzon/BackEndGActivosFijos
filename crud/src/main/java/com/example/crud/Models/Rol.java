package com.example.crud.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table
@Entity
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idRol;
    @Column(nullable = false)
    private String nombre;

    private String Descripcion;
}