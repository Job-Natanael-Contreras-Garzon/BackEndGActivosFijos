package com.example.crud.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Data
@Table
@Entity
public class Departamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idDepto;
    private String nombre;
    private String descripcion;
}
