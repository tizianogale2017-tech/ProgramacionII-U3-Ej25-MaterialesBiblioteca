package Ejercicio25_materialesBiblioteca;

public class MaterialBiblioteca {
    private String titulo;
    private int anioEdicion;
    private String editorial;

    public MaterialBiblioteca(String titulo, int anioEdicion, String editorial) {
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String describir() {
        return "\"" + titulo + "\" (" + anioEdicion + ", " + editorial + ")";
    }
}
