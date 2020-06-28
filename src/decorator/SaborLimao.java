
package decorator;


public class SaborLimao extends Bolo {
    
    public SaborLimao() {
        this.setNome("Bolo de Limão");
    }

    @Override
    public String getAdicionais() {
        return "Limão \n";
    }

    @Override
    public double getValor() {
        return 5;
    }
    
}
