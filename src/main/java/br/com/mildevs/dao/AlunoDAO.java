package br.com.mildevs.dao;

import br.com.mildevs.entity.Aluno;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.util.List;

public class AlunoDAO {

    private EntityManager em;

    public AlunoDAO() {
        this.em = Persistence.createEntityManagerFactory("escola").createEntityManager();
    }

    public boolean criaAluno(Aluno aluno) {
    em.getTransaction().begin();
    em.persist(aluno);
    em.getTransaction().commit();

    return true;
    }

    public Aluno buscaAluno(int codAluno) {
        return em.find(Aluno.class, codAluno);
    }

    public List<Aluno> listaAlunos() {
        return em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
    }

    public boolean removeAluno(int codAluno) {
        Aluno aluno = em.find(Aluno.class, codAluno);

        if (aluno == null) {
            return false;
        } else {
            em.getTransaction().begin();
            em.remove(aluno);
            em.getTransaction().commit();

            return true;
        }
    }
}
