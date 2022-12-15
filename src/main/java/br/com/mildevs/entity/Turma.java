package br.com.mildevs.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Turma {
    @Id
    @Column(name = "codigo_turma")
    private int codigoTurma;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_professor_fk", referencedColumnName = "cod_professor")
    private Professor professor;

    @ManyToMany(mappedBy = "turmas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Aluno> alunos;




    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
}
