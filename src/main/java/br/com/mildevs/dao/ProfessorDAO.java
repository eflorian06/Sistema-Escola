package br.com.mildevs.dao;

import br.com.mildevs.entity.Professor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProfessorDAO {

    private EntityManager em;

    public ProfessorDAO() {
        this.em = Persistence.createEntityManagerFactory("escola").createEntityManager();
    }

    public boolean criaProfessor(Professor professor) {
        em.getTransaction().begin();
        em.persist(professor);
        em.getTransaction().commit();

        return true;
    }

    public Professor buscaProfessor(int codProfessor) {
        return em.find(Professor.class, codProfessor);
    }

    public List<Professor> listaProfessor() {
        return em.createQuery("SELECT p FROM Professor p", Professor.class).getResultList();
    }

    public boolean removeProfessor(int codProfessor) {
        Professor professor = em.find(Professor.class, codProfessor);

        if (professor == null) {
            return false;
        } else {
            em.getTransaction().begin();
            em.remove(professor);
            em.getTransaction().commit();

            return true;
        }
    }


}
