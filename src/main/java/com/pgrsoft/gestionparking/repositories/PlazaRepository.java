package com.pgrsoft.gestionparking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionparking.model.Plaza;

@Repository
public interface PlazaRepository extends JpaRepository<Plaza,Long>{

}
