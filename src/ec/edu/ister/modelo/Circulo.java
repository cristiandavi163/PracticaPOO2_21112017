package ec.edu.ister.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Circulo {
    private Punto p;
    private Double radio;

    public Circulo() {
    }

    public Circulo(Punto p, Double radio) {
        this.p = p;
        this.radio = radio;
    }

    /**
     * @return the p
     */
    public Punto getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Punto p) {
        this.p = p;
    }

    /**
     * @return the radio
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    

}
