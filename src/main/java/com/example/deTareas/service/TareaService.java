package com.example.deTareas.service;
import java.util.List;

import com.example.deTareas.model.Tarea;
import com.example.deTareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TareaService {

    @Autowired
    TareaRepository tareaRepo;

    public void guardarTarea(Tarea tarea) {
        tareaRepo.save(tarea);
    }


    public List<Tarea> listaTarea(){
        return tareaRepo.findAll();
    }

    public void actualizarTarea(Tarea tarea) {
        tareaRepo.save(tarea);
    }

    public void eliminarTarea(Long id) {
        tareaRepo.deleteById(id);

    }

    public Tarea listaTareaId(Long id) {
       return tareaRepo.findById(id).orElse(null);
    }
}
