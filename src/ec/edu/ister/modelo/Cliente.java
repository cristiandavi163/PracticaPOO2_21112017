package ec.edu.ister.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Cliente extends Persona{
 private String codigo;
 private Calendar fecha;

    public Cliente() {
    }

    public Cliente(String codigo, String ci, String nombre, String apellido, String direccion, String telefono, String mail, Date fechaNacimiento) {
        super(ci, nombre, apellido, direccion, telefono, mail, fechaNacimiento);
        this.codigo = codigo;
    }

    public void setCodigo() {
        this.codigo = super.getApellido().substring(0, 3).toUpperCase()+
                getCi().substring(getCi().length()-4);
                //(getApellido().substring(0,3)).toUpperCase()+getCi().substring(0, 3);
    }
    
    public void stringToken(String cadena){
         StringTokenizer st = new StringTokenizer(cadena);
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
    }
            

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String calcularEdad() {
      return "saludos";
    }
 
    
 
}
