package com.pgrsoft.gestionparking.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pgrsoft.gestionparking.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

//	@Query("select r from Reserva r where r.inicio > :finicio and r.inicio < :ffinal")
	@Query("select r from Reserva r where (:finicio <= r.fin) and (:ffinal >= r.inicio) or r.palza.disponible=false")
	public List getNoReservas(Date finicio, Date ffinal);
	
//	@Query("select p from Plaza p where p.codigo not in (select r.palza.codigo from Reserva r where (:finicio <= r.fin) and (:ffinal >= r.inicio) or r.palza.disponible=false)")
//	public List getSiReservas(Date finicio, Date ffinal);

}
