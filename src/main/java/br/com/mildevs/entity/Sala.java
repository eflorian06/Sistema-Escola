package br.com.mildevs.entity;

import jakarta.persistence.*;

@Entity
public class Sala {
    @Id
    @Column(name = "cod_sala")
    private int numeroSala;

    @Column(nullable = false)
    private double largura;

    @Column(nullable = false)
    private double comprimento;

    @Column(nullable = false)
    private double altura;

    @OneToOne
    @JoinColumn(name = "cod_turma_fk", referencedColumnName = "codigo_turma")
    private Turma turma;

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
