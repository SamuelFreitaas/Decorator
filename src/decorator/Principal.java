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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bolo b1 = new SaborBaunilha();
        b1 = new CobChocolate(b1);
        b1 = new Pessego(b1);
        InformacoesBolo.BoloResumo(b1);

        Bolo b2 = new SaborLimao();
        b2 = new CobDoceDeLeite(b2);
        b2 = new Amora(b2);
        InformacoesBolo.BoloResumo(b2);
           
        Bolo b3 = new SaborLaranja();
        b3 = new CobChocolate(b3);
        b3 = new Morango(b3);
        InformacoesBolo.BoloResumo(b3);
       
        
        
    }
    
}
