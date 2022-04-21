package servletsVideojuegos;

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
public class VideojuegoDAO {

    Connection conexion;

    public VideojuegoDAO() {
        conexionBD con = new conexionBD();
        conexion = con.getConexion();
    }

    public List<Videojuego> listarVideojuegos() {

        PreparedStatement ps;
        ResultSet rs;
        List<Videojuego> lista = new ArrayList<>();

        try {
            ps = conexion.prepareStatement("SELECT numCatalogo, titulo, genero, clasificacion, consola, fabricante, version FROM videojuegos");
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCatalogo = rs.getString("numCatalogo");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String clasificacion = rs.getString("clasificacion");
                String consola = rs.getString("consola");
                String fabricante = rs.getString("fabricante");
                int version = rs.getInt("version");

                Videojuego videojuego = new Videojuego(numCatalogo, titulo, genero, clasificacion, consola, fabricante, version);

                lista.add(videojuego);
            }

        } catch (SQLException e) {
        }
        return lista;
    }

    public Videojuego buscarVideojuegos(String _numCatalogo) {

        PreparedStatement ps;
        ResultSet rs;
        Videojuego videojuego = null;

        try {
            ps = conexion.prepareStatement("SELECT numCatalogo, titulo, genero, clasificacion, consola, fabricante, version FROM videojuegos WHERE numCatalogo=?");
            ps.setString(1, _numCatalogo);
            rs = ps.executeQuery();

            while (rs.next()) {
                String numCredencial = rs.getString("numCatalogo");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String clasificacion = rs.getString("clasificacion");
                String consola = rs.getString("consola");
                String fabricante = rs.getString("fabricante");
                int version = rs.getInt("version");

                videojuego = new Videojuego(numCredencial, titulo, genero, clasificacion, consola, fabricante, version);
            }
            return videojuego;
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean agregarVideojuegos(Videojuego videojuego) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO videojuegos (numCatalogo, titulo, genero, clasificacion, consola, fabricante, version) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, videojuego.getNumCatalogo());
            ps.setString(2, videojuego.getTitulo());
            ps.setString(3, videojuego.getGenero());
            ps.setString(4, videojuego.getClasificacion());
            ps.setString(5, videojuego.getConsola());
            ps.setString(6, videojuego.getFabricante());
            ps.setInt(7, videojuego.getVersion());
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public boolean actualizarVideojuegos(Videojuego videojuego) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE videojuegos SET titulo=?, genero=?, clasificacion=?, consola=?, fabricante=?, version=? WHERE numCatalogo=?");
            ps.setString(1, videojuego.getTitulo());
            ps.setString(2, videojuego.getGenero());
            ps.setString(3, videojuego.getClasificacion());
            ps.setString(4, videojuego.getConsola());
            ps.setString(5, videojuego.getFabricante());
            ps.setInt(6, videojuego.getVersion());
            ps.setString(7, videojuego.getNumCatalogo());

            ps.execute();
            return true;

        } catch (SQLException e) {
            return false;
        }

    }

    public boolean eliminarVideojuegos(String _numCatalogo) {

        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM videojuegos WHERE numCatalogo=?");
            ps.setString(1, _numCatalogo);
            ps.execute();

            return true;

        } catch (SQLException e) {
            return false;
        }

    }

}
