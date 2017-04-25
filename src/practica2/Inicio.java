/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;
import org.hibernate.*;
import modelo.*;
//import static java.lang.Thread.sleep;
//import java.sql.Time;

/**
 *
 * @author usuario
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        /*Time time = new Time(System.currentTimeMillis());
        long inicio=time.getTime();
        sleep(2505);
        Time tfinal=new Time(System.currentTimeMillis());
        long mfinal=tfinal.getTime();
        System.out.println(mfinal-inicio);*/
        ManejaExperto me=new ManejaExperto();
        //Experto experto=new Experto("C558", "Juan Lopez", "España", "Huesos");
        //me.guardaExperto(experto);
        //Experto e=me.obtenExperto("C558");
        //e.setSexo('M');
        //me.actualizaExperto(e);
        //me.eliminaExperto(e);
        //me.inicioOperacion();
        //me.finalizaOperacion();
    }
    
}
