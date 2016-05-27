/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.teamj.arquitectura.integracionhotel.model.Consultas;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RICARDO
 */
@LocalBean
@Stateless
public class ConsultasDAO extends DefaultGenericDAOImple<Consultas, Integer>  {

      public ConsultasDAO() {
        super(Consultas.class);
    }
    
}
