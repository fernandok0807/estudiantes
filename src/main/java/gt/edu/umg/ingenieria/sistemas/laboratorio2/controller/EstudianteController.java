/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.controller;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Estudiante;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author enmanuel
 */
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;
    
    @GetMapping("/buscarTodos")
    public List<Estudiante> Todos() {
            return this.estudianteService.buscarTodos();
    }
    
    @PostMapping("/registrar")
    public Estudiante Nuevo(@RequestBody(required = true) Estudiante nuevo) {
        
        return this.estudianteService.nuevo(nuevo);
    }
}
