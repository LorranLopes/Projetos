/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

/**
 *
 * @author 0040482222022
 */
public class Turma {
    private String nomeCurso;
    private int totalAulas;
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(String nomeCurso, int totalAulas) {
        this.nomeCurso = nomeCurso;
        this.totalAulas = totalAulas;
        this.alunos = new Aluno[20];
        this.quantidadeAlunos = 0;
    }

    public void incluirAluno(Aluno al) throws Exception {
        if (quantidadeAlunos >= 20) {
            throw new Exception("A turma já está cheia.");
        }
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getCodigo() == al.getCodigo()) {
                throw new Exception("Código de aluno já existe.");
            }
        }
        alunos[quantidadeAlunos] = al;
        quantidadeAlunos++;
    }

    public Aluno buscarAluno(int codigo) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getCodigo() == codigo) {
                return alunos[i];
            }
        }
        return null;
    }

    public void registrarFalta(int codigo) throws Exception {
        Aluno aluno = buscarAluno(codigo);
        if (aluno == null) {
            throw new Exception("Aluno não encontrado.");
        }
        aluno.incrementarFaltas();
    }

    public void atribuirNota(int codigo, double nota) throws Exception {
        if (nota < 1 || nota > 10) {
            throw new Exception("Nota inválida.");
        }
        Aluno aluno = buscarAluno(codigo);
        if (aluno == null) {
            throw new Exception("Aluno não encontrado.");
        }
        aluno.setNotaFinal(nota);
    }

    public void listarAlunos() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de Aulas: " + totalAulas);
        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = alunos[i];
            double frequencia = 100.0 * (totalAulas - aluno.getQuantidadeFaltas()) / totalAulas;
            System.out.println("Código: " + aluno.getCodigo() +
                               ", Nome: " + aluno.getNome() +
                               ", Nota Final: " + aluno.getNotaFinal() +
                               ", Faltas: " + aluno.getQuantidadeFaltas() +
                               ", Frequência: " + frequencia + "%");
        }
    }

    public void listarAprovados() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de Aulas: " + totalAulas);
        for (int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = alunos[i];
            double frequencia = 100.0 * (totalAulas - aluno.getQuantidadeFaltas()) / totalAulas;
            if (aluno.getNotaFinal() >= 6 && frequencia >= 75) {
                System.out.println("Código: " + aluno.getCodigo() +
                                   ", Nome: " + aluno.getNome() +
                                   ", Nota Final: " + aluno.getNotaFinal() +
                                   ", Faltas: " + aluno.getQuantidadeFaltas() +
                                   ", Frequência: " + frequencia + "%");
            }
        }
    }
}
