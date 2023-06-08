package com.example.demo.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.DAO.IPersonasDAO;
import com.example.demo.VO.PersonaVO;

@Repository
public class PersonasDAOImpl implements IPersonasDAO {

	private static List<PersonaVO> personasList = new ArrayList<PersonaVO>();
	
	static {
		PersonaVO personaVO = new PersonaVO();
		personaVO.setNombre("Fernando");
		personaVO.setEdad(22);
		personaVO.setGenero("Masculino");
		
		personasList.add(personaVO);
		
		
	}
	
	@Override
	public List<PersonaVO> datosGenerales() {
		// TODO Auto-generated method stub
		
		return personasList;
	}

}
