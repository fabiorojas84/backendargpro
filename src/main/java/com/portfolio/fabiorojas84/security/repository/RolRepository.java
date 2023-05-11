package com.portfolio.fabiorojas84.security.repository;

import com.portfolio.fabiorojas84.security.entity.Rol;
import com.portfolio.fabiorojas84.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
