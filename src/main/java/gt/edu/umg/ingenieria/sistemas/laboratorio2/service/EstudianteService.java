/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.laboratorio2.service;

import gt.edu.umg.ingenieria.sistemas.laboratorio2.dao.EstudianteRepository;
import gt.edu.umg.ingenieria.sistemas.laboratorio2.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author enmanuel
 */

@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;   
    
     public List<Estudiante> buscarTodos() {
        return (List<Estudiante>) this.estudianteRepository.findAll();
    }
    
    public Estudiante nuevo(Estudiante nuevo) {               
        return this.estudianteRepository.save(nuevo);
    }
  
    
}
