package com.example.deTareas.model;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String titulo;
    @Column
    private String descipcion;
    @Column
    private String estado;
    @CreationTimestamp
    @Column(name = "fecha_limite")
    private LocalDateTime fechaLimite;

    public Tarea() {

    }

    public Tarea(String descipcion, String estado, LocalDateTime fechaLimite, Long id, String titulo) {
        this.descipcion = descipcion;
        this.estado = estado;
        this.fechaLimite = fechaLimite;
        this.id = id;
        this.titulo = titulo;
    }
}
