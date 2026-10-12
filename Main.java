package Ejercicio25_materialesBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaterialBiblioteca> catalogo = new ArrayList<>();
        catalogo.add(new Libro("Ficciones", 1944, "Sur", "Jorge Luis Borges", 174));
        catalogo.add(new Revista("National Geographic", 2026, "NatGeo", 312, "septiembre"));
        catalogo.add(new Libro("El Túnel", 1948, "Sur", "Ernesto Sabato", 160));

        System.out.println("=== Catálogo de la biblioteca ===");
        for (MaterialBiblioteca m : catalogo) {
            System.out.println(m.describir());
        }
    }
}
