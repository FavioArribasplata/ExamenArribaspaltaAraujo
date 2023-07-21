package com.arribasplata.infraccionservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InfraccionserviceDTO {
	private int id;
	private char dni;
	private char fecha;
	private char falta;
	private char infraccion;
	private char descripcion;
	

}
