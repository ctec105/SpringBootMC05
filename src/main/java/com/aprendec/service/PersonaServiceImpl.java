package com.aprendec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aprendec.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
    @Qualifier("persona1")
	private IPersonaRepo repo; // inyectar
	
	@Override
	public void registrar(String nombre) {
		//repo =  new PersonaRepoImpl(); // no es necesario instanciar
		repo.registrar(nombre);
	}

}
