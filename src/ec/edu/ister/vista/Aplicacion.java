package ec.edu.ister.vista;

import ec.edu.ister.modelo.Circulo;
import ec.edu.ister.modelo.CirculoHerencia;
import ec.edu.ister.modelo.Cliente;
import ec.edu.ister.modelo.Persona;
import ec.edu.ister.modelo.Punto;
import ec.edu.ister.modelo.Trabajador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
       //Punto p= new Punto(5, 9);
//        Circulo c1 = new Circulo();
//        Circulo c2= new Circulo(p, 4.5);

        CirculoHerencia c3 = new CirculoHerencia(4.5,8, 2);
        
        
        
        
        
        
    }
//        Cliente c= new Cliente();
//        c.setApellido("Sosa");
//        c.setCi("123456789");
//        c.setCodigo();
//        JOptionPane.showMessageDialog(null, "Cliente: "+c.getApellido()+"\nCédula:"
//                + ""+c.getCi()+"\nCódigo: "+c.getCodigo());
//        c.stringToken("Pilas estudien sino van a quedarse a supletorio y tendran q+"
//                + "comprar el derecho de examen \n"
//                + "por ende deberan q pagar 30 dolares  ");
//    }
//       Date fechaDate=null;
//        try {
//            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//            String strFecha= "20/05/1984";
//            
//            fechaDate=formato.parse(strFecha);
//        } catch (ParseException ex) {
//            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
//        }    
//            Trabajador tr1;
//                 
//            
//            tr1 = new Trabajador("Docente","123","User1",530.89,"123456789"
//                    , "Carlos","Sosa","San Rafael", "98765432","sosa123@",fechaDate);
//            
//            System.out.println(tr1.getNombre()+" "+tr1.getApellido()+"\n"+
//                    tr1.calcularEdad());
//        
//    }
            

}
