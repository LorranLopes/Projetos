/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author lorra
 */ // Classe Descedente
/**
 *
 * @author lorra
 */ // Classe Descedente
public class Funcionarios extends Pessoa {
    private String departamento;
    private double salarioF;
    private int falta;
    private int valecoxinha;
    
    //Construtor

    public Funcionarios(String nome, String rg, int qtFilhos, String departamento, double salarioF) {
        super(nome, rg, qtFilhos);
        setDepartamento(departamento);
        setSalarioF(salarioF);
        falta= 0;
        valecoxinha=42;
    }

      

    
    
// getters
    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioF() {
        return salarioF;
    }
 //setters

    public void setDepartamento(String departamento) {
        if(departamento.isBlank()){
            System.out.println("Digite o Departamento Gargamel");
        }
        this.departamento = departamento;
    }

    public void setSalarioF(double salarioF) {
       
        if(salarioF == 0)
        {
            System.out.println("Digite o salario Gargamel");
        }
        this.salarioF = salarioF;
    }
  //metodos
   
    public double Salario(){
       return salarioF -(salarioF/20)*falta ;
    }
    @Override
    public double calcularSalario(){
       return salarioF -(salarioF/20)*falta + valecoxinha;
    }
    public void registraFalta(){
       falta++; 
     }
    @Override
    public double valeProcriacao(){
    return getQtFilhos()*procriacao ;
    }
    @Override
    public void zerarMes(){
        
       falta=0;
   }
    @Override
    public void Hollerith(){
            super.Hollerith();
        System.out.printf("Departamento: %s \n  Vale Procriacao: %.2f \n  Salario: %.2f\n Salario com Vale Coxinha %.2f \n Vale coxinha: %d\n",departamento,valeProcriacao(),Salario(),calcularSalario(),valecoxinha);
    
    }
}
