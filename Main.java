import Clases.Vino;

public class Main {
    public static Vino[] generarVinos() {
        Vino[] vinos = {new Vino("19 Crimenes"), new Vino("Penfolds"), new Vino("Santa Julia"), new Vino("Toro")};
        return vinos;
    }
    public static void main(String[] args) {
        Vino[] vinos = generarVinos();
        for (Vino vino : vinos) {
            System.out.println(vino.nombre);
        }
    }
}