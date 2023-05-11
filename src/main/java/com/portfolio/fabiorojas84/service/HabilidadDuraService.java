package com.portfolio.fabiorojas84.service;

import com.portfolio.fabiorojas84.entity.HabilidadDura;
import com.portfolio.fabiorojas84.repository.IHabilidadDuraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadDuraService {
    
    @Autowired
    IHabilidadDuraRepository habilidadDuraRepository;
    
    public List<HabilidadDura> listaHabilidadesDuras() {
        return habilidadDuraRepository.findAll();
    }
    
    public Optional<HabilidadDura> traerHabilidadPorId(int id) {
        return habilidadDuraRepository.findById(id);
    }
    
    public void guardarHabilidadDura (HabilidadDura habilidad){
        habilidadDuraRepository.save(habilidad);
    }
    
    public void eliminarHabilidadDura (int id) {
        habilidadDuraRepository.deleteById(id);
    }
}
