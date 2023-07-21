package com.arribasplata.infraccionservice.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arribasplata.infraccionservice.entity.Infraccionservice;



@Repository
public interface InfraccionserviceRepository extends JpaRepository<Infraccionservice, Integer> {
	List<Infraccionservice> findByDniContaining(String dni, Pageable page);
	List<Infraccionservice> findByIdContaining(int id, Pageable page);

}
