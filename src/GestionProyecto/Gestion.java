package GestionProyecto;

/**
 *
 * @author kalfe
 */
import static GestionProyecto.GestionForm.ContenedorCodigos;

public class Gestion{
    public static boolean comprobar(String Recibe){
     int pos = 0;
      int TamLista = ContenedorCodigos.size();   
      boolean comprobar=false;
       for (int i = 0; i < TamLista; i++){
           if (ContenedorCodigos.get(i).equals(Recibe)){
                pos = i;
                comprobar = true;
                break;
            }
       }    
    return comprobar;
    }
}
