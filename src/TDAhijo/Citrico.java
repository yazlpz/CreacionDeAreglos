package TDAhijo;
import javax.swing.JOptionPane;

public class Citrico extends Frutal{

    public static String desplegableCitrico() {
        String valores[]={"Lima","Limon","Naranja","Toronja"};
        String res =(String)JOptionPane.showInputDialog(null,"Tipo de citrico","Selecciona un tipo: ",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return(res);
    }

}