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
public abstract class Cobertura extends Bolo {

    private Bolo bolo;

    public Cobertura(Bolo b) {
        this.bolo = b;
        this.setNome(b.getNome());
    }

    public Bolo getBolo() {
        return this.bolo;
    }

}
