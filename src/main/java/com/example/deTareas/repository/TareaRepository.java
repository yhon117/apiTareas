package com.example.deTareas.repository;

import com.example.deTareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long>{

}
