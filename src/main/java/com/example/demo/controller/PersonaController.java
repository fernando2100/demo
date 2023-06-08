package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.PersonaBean;
import com.example.demo.VO.PersonaVO;

import com.example.demo.serv.IPersonasService;

@Controller
public class PersonaController {
	
	@Autowired
	IPersonasService personasService;
	
	
	@RequestMapping("/consultar")
	public String consulta(Model modelo) {
		
		List<PersonaBean> personasBean = new ArrayList<PersonaBean>();
		
		List<PersonaVO> personasVO = new ArrayList<PersonaVO>();
		
		personasVO = personasService.datosGenerales();
		
		for (PersonaVO personaVO : personasVO) {
			
			PersonaBean personaBean= new PersonaBean(personaVO.getNombre(),personaVO.getEdad(), personaVO.getGenero());
			
			personasBean.add(personaBean);
		}
		modelo.addAttribute("personas", personasBean);
		
		
		return "consultar";
				
	}

}
