package com.pgrsoft.gestionparking.services.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Reserva;
import com.pgrsoft.gestionparking.repositories.ReservaRepository;

@RestController
public class ReservaRepoController {

	@Autowired
	ReservaRepository reservaRepository;
	
	@GetMapping("/reservas")
	public List<Reserva> getAll(){
		return reservaRepository.findAll();
	}
	
	@GetMapping("/noreservas")
	public List<Reserva> getNoReservas(@RequestParam(value = "inicio", required = true) String inicio,
			@RequestParam(value = "fin", required = true) String fin){
		return reservaRepository.getNoReservas(Date.valueOf(inicio), Date.valueOf(fin));
	}
	
//	@GetMapping("/sireservas")
//	public List<Reserva> getSiReservas(@RequestParam(value = "inicio", required = true) String inicio,
//			@RequestParam(value = "fin", required = true) String fin){
//		return reservaRepository.getSiReservas(Date.valueOf(inicio), Date.valueOf(fin));
//	}
	
}
