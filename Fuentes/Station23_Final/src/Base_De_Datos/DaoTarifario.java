/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.Tarifario;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Braya
 */
public class DaoTarifario {
    
    private ConexionBD bd = new ConexionBD();
    private String mensaje;
    
    public Tarifario tarifarioGet(int tipo_vehiculo) {
        Tarifario tarifario = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("tarifa_hora,")
                .append("comision")
                .append(" FROM tarifario")
                .append(" WHERE tipo_vehiculo = ?");
        try (Connection cn = bd.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, tipo_vehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tarifario = new Tarifario();
                tarifario.setTipo_vehiculo(tipo_vehiculo);
                tarifario.setTarifa_hora(rs.getDouble(1));
                tarifario.setComision(rs.getDouble(2));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return tarifario;
    }
    
    public List<Tarifario> tarifarioSel() {
        List<Tarifario> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_tipo_vehiculo, ")
                .append("tarifa_hora, ")
                .append("comision")
                .append(" FROM tarifario");
        try (Connection c = bd.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Tarifario tarifario = new Tarifario();
                tarifario.setTipo_vehiculo(rs.getInt(1));
                tarifario.setTarifa_hora(rs.getDouble(2));
                tarifario.setComision(rs.getDouble(3));
                lista.add(tarifario);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public String cambiarTarifario(int id_vehiculo, Double tarifa, Double comision){
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE tarifario SET ")
                .append("tarifa_hora = ?,")
                .append("comision = ?")
                .append(" WHERE id_tipo_vehiculo = ? ");
        try (Connection c = bd.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setDouble(1, tarifa);
            ps.setDouble(2, comision);
            ps.setInt(3, id_vehiculo);
            int cont = ps.executeUpdate();
            if (cont == 0) {
                mensaje = "No se pudo actualizar";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }
    
    
    public String getMensaje() {
        return mensaje;
    }
    
}
