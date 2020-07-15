/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import controller.*;
import entity.*;
import java.util.List;
import javax.ejb.EJB;
import service.JoueurFacade;


/**
 *
 * @author T480S
 */
@WebService(serviceName = "JoueurWebService")
public class JoueurWebService {

    /**
     * This is a sample web service operation
     */
        @EJB
    private JoueurFacade joueurFacade;
    private List<Joueur> listJoueurs;
    private joueurController joueurController;

    public  JoueurWebService() {
    }
    @WebMethod(operationName = "Joueurs")
    public List<Joueur> getjoueurs() {
        System.out.println(">>>> getJoueurs");
        System.out.println(" size joueursss = "+joueurFacade.findAll().size()); 
        return joueurFacade.findAll();
    }

    
}
