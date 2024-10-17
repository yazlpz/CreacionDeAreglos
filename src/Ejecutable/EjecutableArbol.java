package Ejecutable;
import javax.swing.JOptionPane;
import Array.Array_Arboles;
import InputOutput.TJOption;

public class EjecutableArbol {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        menu2("Agregar Arboles,Agregar Frutales,Imprimir,Salir");
    }
    public static String desplegable(String menu) {
        String valores[]=menu.split(",");
        String res =(String)JOptionPane.showInputDialog(null,"M E N U","Selecciona una opcion: ",JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
        return(res);
    }

    public static void menu2(String menu) {
        Array_Arboles nuevo=new Array_Arboles((byte)10);
        String sel;
        do {
            sel=desplegable(menu);
            switch(sel) {
                case "Agregar Arboles":nuevo.agregarArboles();break;
                case "Agregar Frutales":nuevo.agregarFrutales();break;
                case "Imprimir":TJOption.panelScroll(nuevo.imprimeDatosArray()); break;
                case "Salir": break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
}