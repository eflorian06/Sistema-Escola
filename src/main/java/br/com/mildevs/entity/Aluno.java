package br.com.mildevs.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Aluno {

    @Id
    private int matricula;
    @Column(nullable = false)

    private String nome;
    @Column(nullable = false)
    private String serie;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @ManyToMany
    @JoinTable(name = "turmas_alunos",
    joinColumns = @JoinColumn(name = "aluno_fk", referencedColumnName = "matricula"),
            inverseJoinColumns = @JoinColumn(name = "turma_fk", referencedColumnName = "codigo_Turma"))
    private List<Turma> turmas;

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
