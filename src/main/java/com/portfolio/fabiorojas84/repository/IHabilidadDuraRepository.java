package com.portfolio.fabiorojas84.repository;

import com.portfolio.fabiorojas84.entity.HabilidadDura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadDuraRepository extends JpaRepository <HabilidadDura, Integer>{
    
}
