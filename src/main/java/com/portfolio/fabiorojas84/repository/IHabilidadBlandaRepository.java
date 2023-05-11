package com.portfolio.fabiorojas84.repository;

import com.portfolio.fabiorojas84.entity.HabilidadBlanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadBlandaRepository extends JpaRepository <HabilidadBlanda, Integer>{    
}
