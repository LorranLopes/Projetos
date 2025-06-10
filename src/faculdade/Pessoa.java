/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author lorra
 */ // Classe Ancestral
public class Pessoa {
    private String nome;
    private String rg;
    private int qtFilhos;
    protected double procriacao;
   // construtor parametalizado 

    public Pessoa(String nome, String rg, int qtFilhos) {
        setNome(nome);
        setRg(rg);
        setQtFilhos(qtFilhos);
        procriacao = 100;
    }
    //getters    

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getQtFilhos() {
        return qtFilhos;
    }

      

       // setters

    public void setNome(String nome) {
        if(nome.isBlank()){
            System.out.println("Nome Invalido Gargamel");
        }
        this.nome = nome;
    }

    public void setRg(String rg) {
        if(rg.isBlank()){
            System.out.println("RG Invalido Gargamel");
        }
        this.rg = rg;
    }

    public void setQtFilhos(int qtFilhos) {
        if(qtFilhos == 0){
        qtFilhos = 0;
        }
        this.qtFilhos = qtFilhos;
    }
    //metodos
   public double calcularSalario(){
    return 0;
    }
   public void Hollerith(){
       System.out.printf("Nome: %s \n RG %s \n Quantidade de filhos %d \n Procriacao: %.2f \n",nome,rg,qtFilhos,procriacao);
   }
    public void zerarMes(){
    }
    public double valeProcriacao(){
    return 0;
    }
}
