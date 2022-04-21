package servletsClientes;

import conexion.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class ClienteDAO {

    Connection conexion;

    public ClienteDAO() {
        conexionBD con = new conexionBD();
        conexion = con.getConexion();
    }

    public List<Cliente> listarClientes() {

        PreparedStatement ps;
        ResultSet rs;
        List<Cliente> lista = new ArrayList<>();

        try {
            ps = conexion.prepareStatement("SELECT numCredencial, nombre, direccion, telefono FROM clientes");
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCredencial = rs.getString("numCredencial");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                Cliente cliente = new Cliente(numCredencial, nombre, direccion, telefono);

                lista.add(cliente);
            }

        } catch (SQLException e) {
        }
        return lista;
    }

    public Cliente buscarClientes(String _numCredencial) {

        PreparedStatement ps;
        ResultSet rs;
        Cliente cliente = null;

        try {
            ps = conexion.prepareStatement("SELECT numCredencial, nombre, direccion, telefono FROM clientes WHERE numCredencial=?");
            ps.setString(1, _numCredencial);
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCredencial = rs.getString("numCredencial");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                cliente = new Cliente(numCredencial, nombre, direccion, telefono);
            }
            return cliente;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean agregarClientes(Cliente cliente) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO clientes (numCredencial, nombre, direccion, telefono) VALUES (?,?,?,?)");
            ps.setString(1, cliente.getNumCredencial());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public boolean actualizarClientes(Cliente cliente) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE clientes SET nombre=?, direccion=?, telefono=? WHERE numCredencial=?");
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setString(3, cliente.getTelefono());
            ps.setString(4, cliente.getNumCredencial());
            
            ps.execute();
            return true;
            
        } catch (SQLException e) {
            return false;
        }

    }

    public boolean eliminarClientes(String _numCredencial) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM clientes WHERE numCredencial=?");
            ps.setString(1, _numCredencial);
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

}
