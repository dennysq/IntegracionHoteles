/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.arquitectura.integracionhotel.dao;

import com.persist.common.dao.DefaultGenericDAOImple;
import com.teamj.arquitectura.integracionhotel.model.Empresa;
import com.teamj.arquitectura.integracionhotel.model.Reservas;
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
public class ReservaDAO extends DefaultGenericDAOImple<Reservas, Integer> {

    public ReservaDAO() {
        super(Reservas.class);
    }

}
