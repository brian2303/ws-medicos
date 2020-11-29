/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registrocita.data;

import com.registrocita.domain.Medicos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 *
 * @author glzs
 */
@Stateless
public class MedicosDAOImpl implements MedicosDAO {
    
    @PersistenceContext(unitName="com.registrocitas_prueba_war_1.0-SNAPSHOTPU")
    EntityManager em;
    
    @Override
    public List<Medicos> findAll() {
        return em.createNamedQuery("Medicos.findAll").getResultList();
    }
    
}
