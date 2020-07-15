/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Joueur;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.JoueurFacade;

/**
 *
 * @author T480S
 */
@ManagedBean(name = "joueurController")
@ViewScoped
public class joueurController  implements Serializable {

    @EJB 
    public JoueurFacade joueurFacade;
    public List<Joueur> listJoueur;     
    
    
    public void initController() {
        listJoueur= joueurFacade.findAll();
        System.err.println(" sizreeeeeeeeeee = "+listJoueur.size());
    }

    public List<Joueur> getListJoueur() {
        return listJoueur;
    }

    public void setListJoueur(List<Joueur> listJoueur) {
        this.listJoueur = listJoueur;
    }

}
