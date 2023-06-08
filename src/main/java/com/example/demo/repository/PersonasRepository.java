package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonaEntity;


@Repository("personasRepository")
public interface PersonasRepository extends CrudRepository<PersonaEntity,String>{

	
}
