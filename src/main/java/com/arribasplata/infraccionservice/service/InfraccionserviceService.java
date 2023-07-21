package com.arribasplata.infraccionservice.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.arribasplata.infraccionservice.entity.Infraccionservice;

public interface InfraccionserviceService {
	public List<Infraccionservice> findAll(Pageable page);
	public List<Infraccionservice> findByDni(String dni, Pageable page);
	public Infraccionservice findById(int id);
	public Infraccionservice save(Infraccionservice infraccionservice);
	public Infraccionservice update (Infraccionservice infraccionservice);
	public void delete(int id);

}
