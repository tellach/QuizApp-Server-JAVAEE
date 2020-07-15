/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Question;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.QuestionFacade;

/**
 *
 * @author T480S
 */
@ManagedBean(name = "questionController")
@ViewScoped
public class questionController {
        @EJB 
    public QuestionFacade questionFacade;
        
    public Question question;
    public int note;


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNote() {
        return note;
    }
    
        
    public void getQuestionAlea(){
        question = questionFacade.getQuestionAlea();
        this.note = 0;
    }
    public int evaluation(int idNote){
        if (idNote == question.getIndiceReponceCorrecte()) return question.getBareme();
        else return 0;
    }


}
