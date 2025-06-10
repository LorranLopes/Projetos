/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author lorra
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professores p1 = new Professores("Lorran","121516",4,"TI",10.0);
        p1.registraAulas(100);
        p1.Hollerith();
        p1.zerarMes();
        Funcionarios f1= new Funcionarios("Lorran","1216351",2,"ADM",1000.0);
        f1.registraFalta();
        f1.Hollerith();
        f1.zerarMes();
        f1.Hollerith();
    
    }
    
}
