/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

/**
 *
 * @author 0040482222022
 */
public class Aluno {
    private int codigo;
    private String nome;
    private double notaFinal;
    private int quantidadeFaltas;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.notaFinal = 0;
        this.quantidadeFaltas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public void incrementarFaltas() {
        this.quantidadeFaltas++;
    }
}


