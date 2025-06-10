/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author lorra
 */ // Classe Descendente
public class Professores extends Pessoa {
    private String curso;
    private double qtHora;
    private double valorHora;
//construtor
    public Professores(String nome, String rg, int qtFilhos, String curso, double valorHora) {
        super(nome, rg, qtFilhos);
        setCurso(curso);
        qtHora=0;
        setValorHora(valorHora);
    }
    //getters

    public String getCurso() {
        return curso;
    }

    public double getQtHora() {
        return qtHora;
    }

    public double getValorHora() {
        return valorHora;
    }
    //setters

    public void setCurso(String curso) {
        if(curso.isBlank()){
            System.out.println("Gargamel BURRO curso Invalido");
        }
        this.curso = curso;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0 ){
            System.out.println("Valor Invalido");
        }
        this.valorHora = valorHora;
    }
    //metodos
    @Override
    public double calcularSalario(){
      return qtHora*valorHora;
    } 
    
   public void registraAulas(int Qtd){
      qtHora+=Qtd;
   } 
    
    @Override
    public double valeProcriacao(){
    return getQtFilhos()*procriacao ;
    }
    @Override
    public void Hollerith(){
            super.Hollerith();
        System.out.printf("Curso: %s \n  Vale Procriacao: %f \n  Salario: %f \n",curso,valeProcriacao(),calcularSalario());
    
    }
   @Override
    public void zerarMes(){
        
       qtHora=0;
   }
      
      
}
    

