package com.portfolio.fabiorojas84.repository;

import com.portfolio.fabiorojas84.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Integer>{
    
}
