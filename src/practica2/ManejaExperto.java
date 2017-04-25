package practica2;

import modelo.*;
import org.hibernate.*;
import Practica2.*;
import java.util.List;
/**
 *
 * @author usuario
 */
public class ManejaExperto {
    private Session sesion;
    private Transaction tran;
    public ManejaExperto()
    {
        
    }
    public void inicioOperacion() throws HibernateException
    {
        sesion=HibernateUtil.getSessionFactory().openSession();
        tran=sesion.beginTransaction();
        System.out.println("Operacion iniciada.");
    }
    public void guardaExperto(Experto experto){
        try {
            inicioOperacion();
            sesion.save(experto);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    public void eliminaExperto(Experto experto) {
        try {
            inicioOperacion();
            sesion.delete(experto);
            System.out.println("Experto borrado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    public void actualizaExperto(Experto experto){
        try {
            inicioOperacion();
            sesion.update(experto);
            System.out.println("Experto actualizado correctamente");
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    public Experto obtenExperto(String idExperto){
        try {
            inicioOperacion();
            return (Experto) sesion.get(Experto.class, idExperto);
        } catch (HibernateException he) {
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    
    
    public void obtenNombresyEspecialidad(){
        try
        {
            inicioOperacion();
            Query query=sesion.createQuery("SELECT e.nombre, e.especialidad form experto as e");
            List<Object[]> listaResultados = query.list();
            for (int i = 0; i < listaResultados.size(); i++) {
                    
                  System.out.println("Nombre "+i+": "+listaResultados.get(i)+" especialidad "+ listaResultados.get(i));
            }
        } catch (HibernateException he){
            throw he;
        }finally{
            finalizaOperacion();
        }
        
         
    }
    
    public void listaConParametro(String keyword){
        try
        {
            inicioOperacion();
            //Query query;
        } catch (HibernateException he){
            throw he;
        }finally{
            finalizaOperacion();
        }
    }
   
    public void obtenCasos(){
        try
        {
            inicioOperacion();
            //Query query;
        } catch (HibernateException he){
            throw he;
        }finally{
            finalizaOperacion();
        }
    }
    
    public void finalizaOperacion(){
        tran.commit();
        sesion.close();
        System.out.println("Operacion finalizada.");
    }
}
