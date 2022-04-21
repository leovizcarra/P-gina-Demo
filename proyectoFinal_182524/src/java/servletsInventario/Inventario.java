package servletsInventario;

/**
 *
 * @author Leo
 */
public class Inventario {

    String numCatalogo;
    int existencia, disponibilidad;

    public Inventario(String numCatalogo, int existencia, int disponibilidad) {
        this.numCatalogo = numCatalogo;
        this.existencia = existencia;
        this.disponibilidad = disponibilidad;
    }

    public String getNumCatalogo() {
        return numCatalogo;
    }

    public void setNumCatalogo(String numCatalogo) {
        this.numCatalogo = numCatalogo;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    
}
