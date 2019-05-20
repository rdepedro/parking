package com.pgrsoft.gestionparking.services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgrsoft.gestionparking.model.Usuario;
import com.pgrsoft.gestionparking.repositories.UsuarioRepository;

@RestController
public class UsuarioRepoController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> getList(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/newuser")
	public Usuario create() {
		Usuario user = new Usuario();
		user.setId(500L);
		user.setNombre("LOLO");
		user.setApellido1("APE1");
		user.setApellido2("APE2");
		return usuarioRepository.save(user);
	}
	
}
