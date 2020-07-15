/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author T480S
 */
@Entity
@Table(name = "question")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Question.findAll", query = "SELECT q FROM Question q")
    , @NamedQuery(name = "Question.findById", query = "SELECT q FROM Question q WHERE q.id = :id")
    , @NamedQuery(name = "Question.findByEnonce", query = "SELECT q FROM Question q WHERE q.enonce = :enonce")
    , @NamedQuery(name = "Question.findByReponse1", query = "SELECT q FROM Question q WHERE q.reponse1 = :reponse1")
    , @NamedQuery(name = "Question.findByReponse2", query = "SELECT q FROM Question q WHERE q.reponse2 = :reponse2")
    , @NamedQuery(name = "Question.findByReponse3", query = "SELECT q FROM Question q WHERE q.reponse3 = :reponse3")
    , @NamedQuery(name = "Question.findByReponse4", query = "SELECT q FROM Question q WHERE q.reponse4 = :reponse4")
    , @NamedQuery(name = "Question.findByIndiceReponceCorrecte", query = "SELECT q FROM Question q WHERE q.indiceReponceCorrecte = :indiceReponceCorrecte")
    , @NamedQuery(name = "Question.findByBareme", query = "SELECT q FROM Question q WHERE q.bareme = :bareme")})
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "enonce")
    private String enonce;
    @Size(max = 255)
    @Column(name = "reponse1")
    private String reponse1;
    @Size(max = 255)
    @Column(name = "reponse2")
    private String reponse2;
    @Size(max = 255)
    @Column(name = "reponse3")
    private String reponse3;
    @Size(max = 255)
    @Column(name = "reponse4")
    private String reponse4;
    @Column(name = "indice_reponce_correcte")
    private Integer indiceReponceCorrecte;
    @Column(name = "bareme")
    private Integer bareme;

    public Question() {
    }

    public Question(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public String getReponse1() {
        return reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    public String getReponse2() {
        return reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    public String getReponse3() {
        return reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    public String getReponse4() {
        return reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    public Integer getIndiceReponceCorrecte() {
        return indiceReponceCorrecte;
    }

    public void setIndiceReponceCorrecte(Integer indiceReponceCorrecte) {
        this.indiceReponceCorrecte = indiceReponceCorrecte;
    }

    public Integer getBareme() {
        return bareme;
    }

    public void setBareme(Integer bareme) {
        this.bareme = bareme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Question)) {
            return false;
        }
        Question other = (Question) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Question[ id=" + id + " ]";
    }
    
}
