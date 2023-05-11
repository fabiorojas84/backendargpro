package com.portfolio.fabiorojas84.service;

import com.portfolio.fabiorojas84.entity.Proyecto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    
    @Autowired
    IProyectoRepository proyectoRepository;
    
    public List<Proyecto> traerProyectos() {
        return proyectoRepository.findAll();
    }
    
    public Optional<Proyecto> traerProyectoPorId(int id) {
        return proyectoRepository.findById(id);
    }
    
    public void guardarProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }
    
    public void eliminarProyecto(int id) {
        proyectoRepository.deleteById(id);
    }

    private static class IProyectoRepository {

        public IProyectoRepository() {
        }

        private Optional<Proyecto> findById(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void deleteById(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void save(Proyecto proyecto) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private List<Proyecto> findAll() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
