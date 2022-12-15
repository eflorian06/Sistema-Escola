package br.com.mildevs.dao;

import br.com.mildevs.entity.Sala;
import br.com.mildevs.entity.Turma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TurmaDAO {

    private EntityManager em;

    public TurmaDAO() {
        this.em = Persistence.createEntityManagerFactory("escola").createEntityManager();
    }

    public boolean criaTurma(Sala sala) {
       Turma tr = new Turma();
       tr.setNumeroSala(sala);

        return true;
    }
}
