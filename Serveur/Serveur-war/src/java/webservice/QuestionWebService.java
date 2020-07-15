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
import java.util.Random;
import javax.ejb.EJB;
import service.*;


/**
 *
 * @author T480S
 */
@WebService(serviceName = "QuestionWebService")
public class QuestionWebService {

    /**
     * This is a sample web service operation
     */
        @EJB
    private QuestionFacade questionFacade;
    
    public  QuestionWebService() {
    }
    @WebMethod(operationName = "getQuestionAlea")
    public Question getQuestionAlea() {     
        return questionFacade.getQuestionAlea();
    }
    @WebMethod(operationName = "addQuestions")
    public Boolean addQuestions(@WebParam(name = "idQuestion") List<Question> questions) {
        questionFacade.addQuestions(questions);
        return true;
    }
    @WebMethod(operationName = "evaluateQuestion")
    public int evaluateQuestion(@WebParam(name = "idQuestion") int idQuestion,@WebParam(name = "idQReponse") int idQReponse) {
        return questionFacade.evaluateQuestion(idQuestion, idQReponse);
    }
    
}
