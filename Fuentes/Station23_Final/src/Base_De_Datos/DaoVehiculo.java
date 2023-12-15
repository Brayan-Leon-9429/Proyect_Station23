/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.Vehiculo;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author Braya
 */
public class DaoVehiculo {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public String vehiculoIns(Vehiculo vehiculo) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO vehiculo( ")
                .append("id_vehiculo,")
                .append("id_tipo_vehiculo,")
                .append("placa")
                .append(") VALUES (?,?,?) ");
        try (Connection c = conexionBD.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, vehiculo.getId_vehiculo());
            ps.setInt(2, vehiculo.getId_tipo_vehiculo());
            ps.setString(3, vehiculo.getPlaca());
            int cont = ps.executeUpdate();
            if (cont == 0) {
                mensaje = "0 filas insertadas";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }

        return mensaje;
    }

    public Vehiculo vehiculoGet(String idVehiculo) {
        Vehiculo v = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_vehiculo,")
                .append("id_tipo_vehiculo,")
                .append("placa")
                .append(" FROM vehiculo")
                .append(" WHERE id_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, idVehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                v = new Vehiculo();
                v.setId_vehiculo(rs.getString(1));
                v.setId_tipo_vehiculo(rs.getInt(2));
                v.setPlaca(rs.getString(3));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return v;
    }

    public String idVehiculo() {
        String id_vehiculo = null;
        Random rand = new Random();
        String prefix = "VEH-";
        do {
            int randomNum = rand.nextInt(90000) + 10000;
            id_vehiculo = prefix + randomNum;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ")
                    .append("id_vehiculo ")
                    .append("FROM registro_estacionamiento ")
                    .append("WHERE id_vehiculo = ?");
            try (Connection cn = conexionBD.getConexion()) {
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ps.setString(1, id_vehiculo);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    break;
                }
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
        } while (true);
        return id_vehiculo;
    }

    public String getMensaje() {
        return mensaje;
    }

}
