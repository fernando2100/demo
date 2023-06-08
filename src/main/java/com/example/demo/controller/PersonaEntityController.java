package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PersonaEntity;
import com.example.demo.service.impl.ServicePersonasEntityImpl;

@RestController
@RequestMapping("/entity")
@CrossOrigin(origins = "*")
public class PersonaEntityController {

	@Autowired
	@Qualifier("ServiceImpl")
	private ServicePersonasEntityImpl servicePersonasEntity;
	
	@GetMapping(path = "/", produces = {"application/json"})
	public List<PersonaEntity> listPersonas(){
		
		
		return servicePersonasEntity.consultarPersonas();
		
	}

}
