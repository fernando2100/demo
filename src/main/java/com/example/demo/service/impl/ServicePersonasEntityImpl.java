package com.example.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PersonaEntity;
import com.example.demo.repository.PersonasRepository;
import com.example.demo.serv.IServicePersonasEntity;


@Service("ServiceImpl")
@Transactional
public class ServicePersonasEntityImpl implements IServicePersonasEntity {

	@Autowired
	@Qualifier("personasRepository")
	private PersonasRepository personasRepository;
	
	@Override
	public List<PersonaEntity> consultarPersonas() {
		// TODO Auto-generated method stub
		return (List<PersonaEntity>) personasRepository.findAll();
	}

	

}
