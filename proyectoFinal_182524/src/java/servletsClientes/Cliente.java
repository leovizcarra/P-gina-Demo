package servletsClientes;

/**
 *
 * @author Leo
 */
public class Cliente {

    String numCredencial, nombre, direccion, telefono;

    public Cliente(String numCredencial, String nombre, String direccion, String telefono) {
        this.numCredencial = numCredencial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNumCredencial() {
        return numCredencial;
    }

    public void setNumCredencial(String numCredencial) {
        this.numCredencial = numCredencial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
