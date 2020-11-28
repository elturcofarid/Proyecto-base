package com.easy.rh.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicarController {
	
	@GetMapping 
	public String multiplicar() {
		int n1 = 10;
		int n2 = 30;
		
		Integer m = n1*n2;
		
		return m.toString();
	}	
	
	@GetMapping(value="/consultarUsuario")
	public String get2(@RequestParam String cedula ) {
		return "el usuario es FArid y la cedula + " + cedula;
	}
	
	@PostMapping
	public String post() {
		return "estamos en el metodo post";
	}
	
	@PutMapping
	public String put() {
		return "metodo put";
	}
}
