/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author samue
 */
public class InformacoesBolo {
 
     public static void BoloResumo(Bolo b) {

        System.out.println("Sabor: " + b.getNome()+"\n");
        System.out.println("Adiconal: " + b.getAdicionais()+ "\n");
        System.out.println("Valor:" + b.getValor() + "\n");

    }

    
}
