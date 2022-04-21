/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletsInventario;

import java.sql.Connection;
import conexion.conexionBD;
import static java.lang.Integer.parseInt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class InventarioDAO {
    
    Connection conexion;

    public InventarioDAO() {
        conexionBD con = new conexionBD();
        conexion = con.getConexion();
    }

    public List<Inventario> listarInventario() {

        PreparedStatement ps;
        ResultSet rs;
        List<Inventario> lista = new ArrayList<>();

        try {
            ps = conexion.prepareStatement("SELECT numCatalogo, existencia, disponibilidad FROM inventariovideojuegos");
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCatalogo = rs.getString("numCatalogo");
                int existencia = parseInt(rs.getString("existencia"));
                int disponibilidad = parseInt(rs.getString("disponibilidad"));

                Inventario inventario = new Inventario(numCatalogo, existencia, disponibilidad);

                lista.add(inventario);
            }

        } catch (SQLException e) {
        }
        return lista;
    }

    public Inventario buscarInventario(String _numCatalogo) {

        PreparedStatement ps;
        ResultSet rs;
        Inventario inventario = null;

        try {
            ps = conexion.prepareStatement("SELECT numCatalogo, existencia, disponibilidad FROM inventariovideojuegos WHERE numCatalogo=?");
            ps.setString(1, _numCatalogo);
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCredencial = rs.getString("numCatalogo");
                int existencia = parseInt(rs.getString("existencia"));
                int disponibilidad = parseInt(rs.getString("disponibilidad"));
                
                inventario = new Inventario(numCredencial, existencia, disponibilidad);
            }
            return inventario;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean inventariar(Inventario inventario) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE inventariovideojuegos SET existencia=? WHERE numCatalogo=?");
            ps.setInt(1, inventario.getExistencia());
            ps.setString(2, inventario.getNumCatalogo());
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }
    
    public boolean desInventariar(Inventario inventario) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE inventariovideojuegos SET existencia=? WHERE numCatalogo=?");
            ps.setInt(1, inventario.getExistencia());
            ps.setString(2, inventario.getNumCatalogo());
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }
    
}
