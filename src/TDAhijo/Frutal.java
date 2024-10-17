package TDAhijo;
import TDApadre.Arbol;

public class Frutal extends Arbol{
    private double tiempoC;
    private String nombreF;
    private String color;

    public Frutal() {
        super();
    }



    public Frutal(String nombre, double altura, String clima, double tiempoC, String nombreF, String color) {
        super(nombre, altura, clima);
        this.tiempoC=tiempoC;
        this.nombreF=nombreF;
        this.color=color;
        // TODO Auto-generated constructor stub
    }

    public void setTiempoC(double tiempoC) {
        this.tiempoC = tiempoC;
    }
    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"Frutal [tiempo Cosecha=" + tiempoC + ", nombre Fruta=" + nombreF + ", color=" + color + "]";
    }



}