package com.example.deTareas.controller;
import java.util.List;

import com.example.deTareas.model.Tarea;
import com.example.deTareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api")
public class TareaControl {

    @Autowired
    TareaService tareaServi;

    @GetMapping(path = "/getTareas")
    public List<Tarea> getTarea(){
        return tareaServi.listaTarea();
    }

    @PostMapping(path = "/crearTareas")
    public void saveTarea(@RequestBody Tarea tarea) {
        tareaServi.guardarTarea(tarea);
    }

    @DeleteMapping(path = "/eliminarTareas/{id}")
    public void eliminarTarea(@PathVariable("id") Long id) {
        tareaServi.eliminarTarea(id);
    }

    @GetMapping(path = "/getTareas/{id}")
    @ResponseBody
    public Tarea buscarTareas(@PathVariable Long id){
       return tareaServi.listaTareaId(id);
    }

    @PutMapping(path = ("/acutTareas"))
    public void actuTareas(@RequestBody Tarea tarea){
        tareaServi.actualizarTarea(tarea);
    }



}
