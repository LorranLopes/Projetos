/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno;

/**
 *
 * @author 0040482222022
 */
public class Escola {
    public static void main(String[] args) {
        try {
            Turma turma = new Turma("Curso de Informática", 50);

            Aluno aluno1 = new Aluno(1, "Alice");
            Aluno aluno2 = new Aluno(2, "Bob");
            Aluno aluno3 = new Aluno(3, "Charlie");

            turma.incluirAluno(aluno1);
            turma.incluirAluno(aluno2);
            turma.incluirAluno(aluno3);

            turma.registrarFalta(1);
            turma.registrarFalta(1);
            turma.registrarFalta(2);

            turma.atribuirNota(1, 8.5);
            turma.atribuirNota(2, 7.0);
            turma.atribuirNota(3, 5.0);

            System.out.println("Lista de Alunos:");
            turma.listarAlunos();

            System.out.println("\nLista de Aprovados:");
            turma.listarAprovados();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

    

