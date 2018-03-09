/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jc;

/**
 *
 * @author rapid
 */
public class PooJc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        
        //Tenemos que generar antes los objetos de las
        //clases anteriores
        Usuario x=new Usuario();
        x.setAltura(1.68f);
        x.setPeso(80); 
        Imc algo=new Imc();
        algo.u=x;
        //Calculamos el imc a traves de su objeto
        System.out.println( algo.calcular());
       
               
    }
    
}
