package br.com.mildevs.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {

    @Id
    @Column(name = "cod_professor")
    private int codProfessor;

    @Column(nullable = false)
    private String nomeProfessor;

    @Column(nullable = false)
    private String telefoneProfessor;

    @Column(name = "nivel_graduacao")
    private String nivelGrad;

    @Column(nullable = false)
    private double salarioProfessor;

    @Column(nullable = false)
    private String disciplinaProfessor;

    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private List<Turma> turmas;


    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getTelefoneProfessor() {
        return telefoneProfessor;
    }

    public void setTelefoneProfessor(String telefoneProfessor) {
        this.telefoneProfessor = telefoneProfessor;
    }

    public String getNivelGrad() {
        return nivelGrad;
    }

    public void setNivelGrad(String nivelGrad) {
        this.nivelGrad = nivelGrad;
    }

    public double getSalarioProfessor() {
        return salarioProfessor;
    }

    public void setSalarioProfessor(double salarioProfessor) {
        this.salarioProfessor = salarioProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }

    public void setDisciplinaProfessor(String disciplinaProfessor) {
        this.disciplinaProfessor = disciplinaProfessor;
    }
}
