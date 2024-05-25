package Clases;

public class Vino {
    public int anada;
    public String imagenEtiqueta;
    public String nombre;
    public String notaDeCataBodega;
    public double precioARS;
    public Varietal varietal;

    public Vino(String nom) {
        nombre = nom;
    }
    public void calcularRanking() {}
    public void compararEtiqueta() {}
    public void esDeBodega() {}
    public void esDeRegionVitivinicola() {}
}