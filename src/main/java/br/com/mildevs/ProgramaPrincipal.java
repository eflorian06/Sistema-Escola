package br.com.mildevs;

import br.com.mildevs.entity.Professor;
import br.com.mildevs.entity.Turma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("escola");

        EntityManager em = emf.createEntityManager();

        Professor professor = new Professor();
        professor.setCodProfessor(1);
        professor.setNomeProfessor("João");
        professor.setDisciplinaProfessor("Matemática");
        professor.setNivelGrad("Doutorado");
        professor.setSalarioProfessor(5000);
        professor.setTelefoneProfessor("999999999");

        Turma turma = new Turma();
        turma.setCodigoTurma(1);

        List<Turma> turmasJoao = new ArrayList<Turma>();
        turma.setProfessor(professor);
        turmasJoao.add(turma);
        professor.setTurmas(turmasJoao);

        em.getTransaction().begin();
        em.persist(professor);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

