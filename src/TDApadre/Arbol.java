package TDApadre;

public class Arbol {
    protected String Nombre;
    protected double Altura;
    protected String Clima;

    public Arbol() {
        super();
    }
    public Arbol(String nombre, double altura, String clima) {
        Nombre = nombre;
        Altura = altura;
        Clima = clima;
    }
    public String getNombre() {
        return Nombre;
    }
    public double getAltura() {
        return Altura;
    }
    public String getClima() {
        return Clima;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    public void setClima(String clima) {
        Clima = clima;
    }
    @Override
    public String toString() {
        return "Arbol [Nombre=" + Nombre + ", Altura=" + Altura + ", Clima=" + Clima + "]";
    }


}