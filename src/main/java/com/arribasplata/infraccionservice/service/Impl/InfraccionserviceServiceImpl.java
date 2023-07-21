package com.arribasplata.infraccionservice.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arribasplata.infraccionservice.entity.Infraccionservice;
import com.arribasplata.infraccionservice.repository.InfraccionserviceRepository;
import com.arribasplata.infraccionservice.service.InfraccionserviceService;
import com.arribasplata.infraccionservice.validator.InfraccionserviceValidator;

@Service
public class InfraccionserviceServiceImpl implements InfraccionserviceService {
    @Autowired
    private InfraccionserviceRepository repository;
    
	@Override
	@Transactional(readOnly=true)
	public List<Infraccionservice> findAll(Pageable page) {
		try {
			return repository.findAll(page).toList();
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	@Transactional
	public List<Infraccionservice> findByDni(String dni, Pageable page) {
		try {
			return repository.findByDniContaining(dni, page);
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public Infraccionservice findById(int id) {
		try {
			Infraccionservice registro= repository.findById(id).orElseThrow();
			return registro;
		}catch(Exception e) {
			return null;
		}
		
	}

	
	
	
	@Override
	public Infraccionservice save(Infraccionservice infraccionservice) {
		try {
			InfraccionserviceValidator.save(infraccionservice);
			infraccionservice.setActivo(true);
			Infraccionservice registro=repository.save(infraccionservice);
			return registro;
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public Infraccionservice update(Infraccionservice infraccionservice) {
		try {
			InfraccionserviceValidator.save(infraccionservice);
			Infraccionservice registro = repository.findById(infraccionservice.getId()).orElseThrow();
			registro.setDni(infraccionservice.getDni());
			registro.setFecha(infraccionservice.getFecha());
			repository.save(registro);
			return registro;
		}catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public void delete(int id) {
		try {
			Infraccionservice registro=repository.findById(id).orElseThrow();
			repository.delete(registro);
		}catch(Exception e) {
			
		}
		
	}

}














