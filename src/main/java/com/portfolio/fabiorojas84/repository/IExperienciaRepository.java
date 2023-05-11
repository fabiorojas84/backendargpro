package com.portfolio.fabiorojas84.repository;

import com.portfolio.fabiorojas84.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Integer>{
    
}
