package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IPersonasDAO;
import com.example.demo.VO.PersonaVO;
import com.example.demo.serv.IPersonasService;

@Service
public class PersonasServiceImpl implements IPersonasService {

	@Autowired
	IPersonasDAO personasDAO;
		
	
	@Override
	public List<PersonaVO> datosGenerales() {
		// TODO Auto-generated method stub
		return personasDAO.datosGenerales();
	}

}
