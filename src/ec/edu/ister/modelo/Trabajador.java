package ec.edu.ister.modelo;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Trabajador extends Persona implements Salario{
private String tipo;
    private String password;
    private String usuario;
    private double sueldo;

    public Trabajador() {
    }

    public Trabajador(String tipo, String password, String usuario, double sueldo, String ci, String nombre, String apellido, String direccion, String telefono, String mail, Date fechaNacimiento) {
        super(ci, nombre, apellido, direccion, telefono, mail, fechaNacimiento);
        this.tipo = tipo;
        this.password = password;
        this.usuario = usuario;
        this.sueldo = sueldo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
@Override
    public String calcularEdad(){
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Format fecN= new SimpleDateFormat("dd/MM/yyy");
        
        LocalDate fechaNacimiento=LocalDate.parse(fecN.format(getFechaNacimiento()),frm);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, ahora);
        return "Edad:"+periodo.getYears()+" años"+periodo.getMonths()+" meses";
    }

@Override
     public double sueldo(){
         return sueldo;
     }
@Override  
     public void mensaje(){
         
     }
}
