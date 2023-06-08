package com.example.demo.serv;

import java.util.List;

import com.example.demo.entity.PersonaEntity;

public interface IServicePersonasEntity {
	
		public abstract List<PersonaEntity> consultarPersonas();
}
