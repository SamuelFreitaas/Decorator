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
public class CobDoceDeLeite extends Cobertura {
    
     public CobDoceDeLeite(Bolo b) {
        super(b);
    }

    @Override
    public String getAdicionais() {

        return  this.getBolo().getAdicionais() + "Cobertura: Doce de Leite \n";
    }

    @Override
    public double getValor() {

        return 1.5 + this.getBolo().getValor();
    }
}
