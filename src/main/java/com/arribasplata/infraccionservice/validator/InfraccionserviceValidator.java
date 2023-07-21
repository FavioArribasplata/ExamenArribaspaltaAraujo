package com.arribasplata.infraccionservice.validator;

import com.arribasplata.infraccionservice.entity.Infraccionservice;


public class InfraccionserviceValidator {
    public static void save(Infraccionservice infraccionservice) {
        if(infraccionservice.getDni()== null || infraccionservice.getDni().isEmpty()) 
        }
             throw new RuntimeException("Numero de Dni requerido");
        }
        if(infraccionservice.getDni().length()>100) 
        {
             throw new RuntimeException("E1 DNI es muy largo");
        }
        if(infraccionservice.getFecha()==null) {
            throw new RuntimeException("La fecha es requerida");
        }
        {
             throw new RuntimeException("Ingrese un fecha valida");
                                       
        }
                                       
    }
}