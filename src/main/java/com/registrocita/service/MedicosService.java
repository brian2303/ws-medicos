/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registrocita.service;

import com.registrocita.data.MedicosDAO;
import com.registrocita.domain.Medicos;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/medicos")
public class MedicosService {
    
    @Inject
    private MedicosDAO medicoDAO;
    
    @GET
    @Produces(value=MediaType.APPLICATION_JSON)
    public List<Medicos> DoctorList(){
        List<Medicos> doctors = medicoDAO.findAll();
        System.out.println("doctors encontrados:" + doctors);
        return doctors;
    }
}
