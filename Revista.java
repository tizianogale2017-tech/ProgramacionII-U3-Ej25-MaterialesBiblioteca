package Ejercicio25_materialesBiblioteca;

public class Revista extends MaterialBiblioteca {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, int anioEdicion, String editorial, int numeroEdicion, String mesPublicacion) {
        super(titulo, anioEdicion, editorial);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String describir() {
        return "REVISTA " + super.describir() + " - N° " + numeroEdicion + ", " + mesPublicacion;
    }
}
