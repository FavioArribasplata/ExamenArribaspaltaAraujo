package com.arribasplata.infraccionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import com.arribasplata.infraccionservice.entity.Infraccionservice;
import com.arribasplata.infraccionservice.service.InfraccionserviceService;


@RestController
@RequestMapping("/v1/infraccionservices")
public class InfraccionserviceController {
	@Autowired
	private InfraccionserviceService service;
	
//	@GetMapping()
//	public ResponseEntity<List<Infraccionservice>> findAll(
//			@RequestParam(value = "id", required = false, defaultValue = "") int id,
//			@RequestParam(value = "dni", required = false, defaultValue = "7") int pageDni,
//			@RequestParam(value = "limit", required = false, defaultValue = "5") int pageSize
//			){
//		Pageable page= PageRequest.of(pageDni, pageSize);
//		List<Infraccionservice> infraccionservice;
//		if(infraccionservice==null) {
//			infraccionservice=service.findAll(page);
//		}else {
//			infraccionservice=service.findById(infraccionservice, page);
//		}
//		
//		if(infraccionservice.isEmpty()) {
//			return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.ok(infraccionservice);
//	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Infraccionservice> findById(@PathVariable("id")int id){
		Infraccionservice infraccionservice = service.findById(id);
		if(infraccionservice==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(infraccionservice);
	}
	
	@PostMapping()
	public ResponseEntity<Infraccionservice> create(@RequestBody Infraccionservice infraccionservice){
		Infraccionservice registro=service.save(infraccionservice);
		return ResponseEntity.status(HttpStatus.CREATED).body(registro);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Infraccionservice> update(@PathVariable("id") int id, @RequestBody Infraccionservice infraccionservice) {
		Infraccionservice registro = service.update(infraccionservice);
		if (registro==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(registro);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Infraccionservice> delete(@PathVariable("id") int id) {
		service.delete(id);
		return ResponseEntity.ok(null);
	}
	

}














