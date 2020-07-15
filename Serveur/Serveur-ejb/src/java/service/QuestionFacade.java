/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Question;
import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author T480S
 */
@Stateless
public class QuestionFacade extends AbstractFacade<Question>{

    @PersistenceContext(unitName = "Serveur-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuestionFacade() {
        super(Question.class);
    }
    
    public Question getQuestionAlea() {
        List<Question> listQuestions = super.findAll();
        Random rand = new Random();
        int randomId = listQuestions.get(rand.nextInt(listQuestions.size())).getId();        
        return super.find(randomId);
    }
    
    public Boolean addQuestions(List<Question> questions) {
       for(Question q : questions) {
           super.create(q);
       }
        return true;
    }
    public int evaluateQuestion(int idQuestion, int idQReponse) {
        Question question = super.find(idQuestion);
        int idCorrectReponse = question.getIndiceReponceCorrecte();
        if (idCorrectReponse == idQReponse){
            return question.getBareme();
        }else{
            return 0;

        }        
    }
}
