package com.portfolio.fabiorojas84.service;

import com.portfolio.fabiorojas84.entity.Educacion;
import com.portfolio.fabiorojas84.repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
    
    @Autowired
    IEducacionRepository educacionRepository;
    
    public List<Educacion> listaEducacion() {
        return educacionRepository.findAll();
    }
    
    public Optional<Educacion> traerEducacionPorId(int id) {
        return educacionRepository.findById(id);
    }
    
    public void guardarEducacion (Educacion educacion) {
        educacionRepository.save(educacion);
    }
    
    public void eliminarEducacion (int id) {
        educacionRepository.deleteById(id);
    }  
}
