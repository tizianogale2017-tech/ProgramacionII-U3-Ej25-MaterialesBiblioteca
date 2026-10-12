package Ejercicio25_materialesBiblioteca;

public class Libro extends MaterialBiblioteca {
    private String autor;
    private int paginas;

    public Libro(String titulo, int anioEdicion, String editorial, String autor, int paginas) {
        super(titulo, anioEdicion, editorial);
        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public String describir() {
        return "LIBRO " + super.describir() + " - autor: " + autor + ", " + paginas + " páginas";
    }
}
