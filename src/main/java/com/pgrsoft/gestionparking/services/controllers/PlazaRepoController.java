package com.pgrsoft.gestionparking.services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Plaza;
import com.pgrsoft.gestionparking.repositories.PlazaRepository;

@RestController
public class PlazaRepoController {

	@Autowired
	PlazaRepository plazaRepository;
	
	@GetMapping("/plazas")
	public List<Plaza> getAll(){
		return plazaRepository.findAll();
	}
}
