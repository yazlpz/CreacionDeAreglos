package Array;
import TDApadre.Arbol;
import InputOutput.TJOption;
import TDAhijo.Frutal;
import TDAhijo.Citrico;

public class Array_Arboles{
    private Arbol arboles[];
    private byte j;

    public Array_Arboles(byte tam) { //crea un objeto de arbol con el tamaño del arreglo
        arboles=new Arbol[tam];
        j=-1;
    }

    public boolean arrayVacio() { //metodo para saber si el arreglo esta vacio
        return(j==-1);
    }

    public boolean espacioArray() { // metodo para saber si aun queda espacio en el arreglo
        return (j<arboles.length-1);
    }

    public Arbol agregarArbol() { /*no se si paty aun te enseña esto pero así es mucho más fácil llenar datos
    con los set de la clase que quieras pues llenar jaja*/
        Arbol emp2=new Arbol();
        emp2.setNombre(TJOption.leerString("Nombre: "));
        emp2.setAltura(TJOption.leerDouble("Altura"));
        emp2.setClima(TJOption.leerString("Clima"));
        return emp2;
    }

    public Frutal agregarFrutal() {
        Frutal emp1=new Frutal();
        emp1.setNombre(TJOption.leerString("Nombre: "));
        emp1.setAltura(TJOption.leerDouble("Altura"));
        emp1.setClima(TJOption.leerString("Clima"));
        emp1.setTiempoC(TJOption.leerDouble("Tiempo cosecha"));
        emp1.setNombreF(Citrico.desplegableCitrico());
        emp1.setColor(TJOption.leerString("Color"));
        return emp1;
    }


    public void agregarArboles() { //este es el metodo que te agrega los datos al arreglo
        if (espacioArray()) {
            j++;
            arboles[j]=agregarArbol();
        }
    }
    public void agregarFrutales() { //lo mismo que el anterios pero en otro arreglo para que esten separados y haya un "orden" si asi lo quieres ver
        if (espacioArray()) {
            j++;
            arboles[j]=agregarFrutal();
        }
    }

    public String imprimeDatosArray() { //te imprime los datos
        String cad="";
        for (byte i=0;i<=j;i++) { //j: significa el tamaño que tiene el arreglo
            cad+=i+"["+arboles[i].toString()+"]\n"; //aqui jalas el toString y es más facil imprimir no como la nacada que hizo tu mamá
        }
        return cad; //si no retonas la cadena te da error evidentemente
    }

}