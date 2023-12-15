/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.Registro;
import clases.RegistroInicial;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Braya
 */
public class DaoRegistro {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public List<RegistroInicial> regIniIngTodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngTodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoATodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'A%'");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoATodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoBTodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'B%'");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroInicial> regIniIngPisoBTodoVehiSel(String tipo_vehi) {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("placa, ")
                .append("tipo_vehiculo, ")
                .append("id_ubicacion, ")
                .append("hora_entrada")
                .append(" FROM registro_inicial")
                .append(" WHERE id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroInicial registroInicial = new RegistroInicial();
                registroInicial.setPlaca(rs.getString(1));
                registroInicial.setTipo_vehiculo(rs.getString(2));
                registroInicial.setLugar(rs.getString(3));
                registroInicial.setHora_entrada(rs.getTimestamp(4));
                lista.add(registroInicial);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    public Registro buscarIDVehiculo(String id_vehiculo) {
        Registro registro = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_ubicacion,")
                .append("id_administrador,")
                .append("id_vehiculo,")
                .append("hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" WHERE id_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, id_vehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registro = new Registro();
                registro.setId_ubicacion(rs.getString(1));
                registro.setId_administrador(rs.getInt(2));
                registro.setId_vehiculo(rs.getString(3));
                registro.setHora_entrada(rs.getTimestamp(4));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return registro;
    }

    public String regIniIns(String id_ubicacion, int administrador, String id_vehiculo, Date hora_entrada) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(hora_entrada);
        StringBuilder sql = new StringBuilder();
        sql = new StringBuilder();
        sql.append("INSERT INTO registro_estacionamiento ")
                .append("(id_ubicacion, id_administrador, id_vehiculo, hora_entrada) ")
                .append("VALUES (?, ?, ?, ?)");
        try (Connection cnInsert = conexionBD.getConexion()) {
            PreparedStatement psInsert = cnInsert.prepareStatement(sql.toString());
            psInsert.setString(1, id_ubicacion);
            psInsert.setInt(2, administrador);
            psInsert.setString(3, id_vehiculo);
            psInsert.setString(4, formattedDate);
            int resultadoInsert = psInsert.executeUpdate();
            if (resultadoInsert == 0) {
                mensaje = "Cero registros insertados";
            } else {
                mensaje = "Se Registró correctamente";
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
