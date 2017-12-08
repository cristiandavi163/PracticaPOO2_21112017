package ec.edu.ister.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class CirculoHerencia extends Punto{
    private double radio;

    public CirculoHerencia() {
    }

    public CirculoHerencia(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    

}
