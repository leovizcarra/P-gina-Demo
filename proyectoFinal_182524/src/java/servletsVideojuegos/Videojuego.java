package servletsVideojuegos;

/**
 *
 * @author Leo
 */
public class Videojuego {

    String numCatalogo, titulo, genero, clasificacion, consola, fabricante;
    int version;

    public Videojuego(String numCatalogo, String titulo, String genero, String clasificacion, String consola, String fabricante, int version) {
        this.numCatalogo = numCatalogo;
        this.titulo = titulo;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.consola = consola;
        this.fabricante = fabricante;
        this.version = version;
    }

    public String getNumCatalogo() {
        return numCatalogo;
    }

    public void setNumCatalogo(String numCatalogo) {
        this.numCatalogo = numCatalogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
