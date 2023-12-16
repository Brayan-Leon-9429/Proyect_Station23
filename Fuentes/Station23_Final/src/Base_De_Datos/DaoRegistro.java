/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import clases.Cupon;
import clases.Descuento;
import clases.Ingresos;
import clases.Registro;
import clases.RegistroFinal;
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

public class DaoRegistro {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public List<RegistroInicial> regIniIngTodoSel() {
        List<RegistroInicial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento ")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE registro_estacionamiento.hora_salida IS NULL");
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
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE tipo_vehiculo.nombre = ?")
                .append(" AND registro_estacionamiento.hora_salida IS NULL");
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
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND registro_estacionamiento.hora_salida IS NULL");
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
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND registro_estacionamiento.hora_salida IS NULL");
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
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND registro_estacionamiento.hora_salida IS NULL");
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
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND registro_estacionamiento.hora_salida IS NULL");
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

    public List<RegistroFinal> regFinTodoSel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinTodoVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE tipo_vehiculo.nombre = ?")
                .append(" AND (DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoASel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND (DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoAVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND (DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoBSel(String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND (DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ps.setString(2, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoBVehiSel(String tipo_vehi, String fecha) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND (DATE(registro_estacionamiento.hora_entrada) = ?")
                .append(" OR DATE(registro_estacionamiento.hora_salida) = ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fecha);
            ps.setString(3, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    //..........................................
    public List<RegistroFinal> regFinTodoSelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinTodoVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE tipo_vehiculo.nombre = ?")
                .append(" AND ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoASelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoAVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'A%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoBSelRango(String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fechaIni);
            ps.setString(2, fechaFinal);
            ps.setString(3, fechaIni);
            ps.setString(4, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<RegistroFinal> regFinPisoBVehiSelRango(String tipo_vehi, String fechaIni, String fechaFinal) {
        List<RegistroFinal> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("vehiculo.placa, ")
                .append("tipo_vehiculo.nombre, ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.hora_entrada, ")
                .append("registro_estacionamiento.hora_salida, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE registro_estacionamiento.id_ubicacion LIKE 'B%'")
                .append(" AND tipo_vehiculo.nombre = ?")
                .append(" AND ((DATE(registro_estacionamiento.hora_entrada) BETWEEN ? AND ?) ")
                .append(" OR (DATE(registro_estacionamiento.hora_salida) BETWEEN ? AND ?))");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, tipo_vehi);
            ps.setString(2, fechaIni);
            ps.setString(3, fechaFinal);
            ps.setString(4, fechaIni);
            ps.setString(5, fechaFinal);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                RegistroFinal registroFinal = new RegistroFinal();
                registroFinal.setPlaca(rs.getString(1));
                registroFinal.setTipo_vehiculo(rs.getString(2));
                registroFinal.setId_ubicacion(rs.getString(3));
                registroFinal.setHora_entrada(rs.getTimestamp(4));
                registroFinal.setHora_salida(rs.getTimestamp(5));
                registroFinal.setPago_total(rs.getDouble(6));
                lista.add(registroFinal);
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
                .append("id_ubicacion, ")
                .append("id_administrador, ")
                .append("id_vehiculo, ")
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

    public Registro buscarRegistro(String id_vehiculo) {
        Registro registro = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_administrador, ")
                .append("id_vehiculo, ")
                .append("id_ubicacion, ")
                .append("id_tarifa, ")
                .append("hora_entrada, ")
                .append("hora_salida, ")
                .append("id_cupon, ")
                .append("id_pago")
                .append(" FROM registro_estacionamiento")
                .append(" WHERE id_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, id_vehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                registro = new Registro();
                registro.setId_administrador(rs.getInt(1));
                registro.setId_vehiculo(rs.getString(2));
                registro.setId_ubicacion(rs.getString(3));
                registro.setId_tarifa(rs.getInt(4));
                registro.setHora_entrada(rs.getTimestamp(5));
                registro.setHora_salida(rs.getTimestamp(6));
                registro.setId_cupon(rs.getString(7));
                registro.setId_pago(rs.getString(8));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return registro;
    }

    public Cupon buscarCupon(String codigo) {
        Cupon cupon = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_cupon, ")
                .append("descuento")
                .append(" FROM cupon")
                .append(" WHERE id_cupon = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cupon = new Cupon();
                cupon.setId_cupon(rs.getString(1));
                cupon.setDescuento(rs.getDouble(2));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return cupon;
    }

    public boolean eliminarCupon(String codigo) {
        boolean b = false;
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE")
                .append(" FROM cupon")
                .append(" WHERE id_cupon = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, codigo);
            int cont = ps.executeUpdate();
            if (cont > 0) {
                b = true;
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return b;
    }

    public boolean insertarCupon(Cupon cupon) {
        boolean b = false;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO cupon")
                .append("(id_cupon, descuento) ")
                .append("VALUES (?, ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, cupon.getId_cupon());
            ps.setDouble(2, cupon.getDescuento());
            int cont = ps.executeUpdate();
            if (cont > 0) {
                b = true;
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return b;
    }

    public List<Cupon> cuponSel() {
        List<Cupon> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_cupon, ")
                .append("descuento")
                .append(" FROM cupon");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Cupon c = new Cupon();
                c.setId_cupon(rs.getString(1));
                c.setDescuento(rs.getDouble(2));
                lista.add(c);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public List<Ingresos> regFinDiarios(String fecha) {
        List<Ingresos> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("tipo_vehiculo.nombre, ")
                .append("pago.hora_pago, ")
                .append("pago.pago_total")
                .append(" FROM registro_estacionamiento")
                .append(" JOIN vehiculo ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" JOIN tipo_vehiculo ON vehiculo.id_tipo_vehiculo = tipo_vehiculo.id_tipo_vehiculo")
                .append(" JOIN pago ON registro_estacionamiento.id_pago = pago.id_pago")
                .append(" WHERE DATE(pago.hora_pago) = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, fecha);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Ingresos ingresos = new Ingresos();
                ingresos.setTipo_vehiculo(rs.getString(1));
                ingresos.setHora_pago(rs.getTimestamp(2));
                ingresos.setMonto(rs.getDouble(3));
                lista.add(ingresos);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public String regIniIns(String id_ubicacion, int administrador, String id_vehiculo, Date hora_entrada, int id_tarifa) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(hora_entrada);
        StringBuilder sql = new StringBuilder();
        sql = new StringBuilder();
        sql.append("INSERT INTO registro_estacionamiento ")
                .append("(id_ubicacion, id_administrador, id_vehiculo, hora_entrada, id_tarifa, id_cupon, id_pago) ")
                .append("VALUES (?, ?, ?, ?, ?, 1, 1)");
        try (Connection cnInsert = conexionBD.getConexion()) {
            PreparedStatement psInsert = cnInsert.prepareStatement(sql.toString());
            psInsert.setString(1, id_ubicacion);
            psInsert.setInt(2, administrador);
            psInsert.setString(3, id_vehiculo);
            psInsert.setString(4, formattedDate);
            psInsert.setInt(5, id_tarifa);
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

    public String regFinIns(Registro registro) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatHoraSalida = formatter.format(registro.getHora_salida());
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE registro_estacionamiento SET ")
                .append("hora_salida = ?, ")
                .append("id_cupon = ?, ")
                .append("id_pago = ? ")
                .append("WHERE id_vehiculo = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, formatHoraSalida);
            ps.setString(2, registro.getId_cupon());
            ps.setString(3, registro.getId_pago());
            ps.setString(4, registro.getId_vehiculo());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "No se actualizo ningun registro";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    public Registro buscarPlaca(String placa) {
        Registro registro = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("registro_estacionamiento.id_ubicacion, ")
                .append("registro_estacionamiento.id_administrador,")
                .append("registro_estacionamiento.id_vehiculo, ")
                .append("registro_estacionamiento.hora_entrada")
                .append(" FROM registro_estacionamiento JOIN vehiculo")
                .append(" ON registro_estacionamiento.id_vehiculo = vehiculo.id_vehiculo")
                .append(" WHERE vehiculo.placa= ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, placa);
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

    public Descuento buscarDesc(int codigo) {
        Descuento d = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_descuento, ")
                .append("tiempo, ")
                .append("valor_descuento")
                .append(" FROM descuento")
                .append(" WHERE id_descuento = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                d = new Descuento();
                d.setId_descuento(rs.getInt(1));
                d.setTiempo(rs.getDouble(2));
                d.setDescuento(rs.getDouble(3));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return d;
    }

    public Double obtDesc(Double horas) {
        Double descuento = 1.0;
        List<Descuento> descuentos = descSel();
        Double maxTiempo = Double.NEGATIVE_INFINITY;
        for (Descuento desc : descuentos) {
            if (desc.getTiempo() < horas && desc.getTiempo() > maxTiempo) {
                maxTiempo = desc.getTiempo();
                descuento = desc.getDescuento();
            }
        }
        return descuento;
    }

    public boolean eliminarDescuento(int codigo) {
        boolean b = false;
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE")
                .append(" FROM descuento")
                .append(" WHERE id_descuento = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, codigo);
            int cont = ps.executeUpdate();
            if (cont > 0) {
                b = true;
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return b;
    }

    public boolean insertarDescuento(Descuento d) {
        boolean b = false;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO descuento")
                .append("(id_descuento, tiempo, valor_descuento) ")
                .append("VALUES (?, ?, ?)");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, d.getId_descuento());
            ps.setDouble(2, d.getTiempo());
            ps.setDouble(3, d.getDescuento());
            int cont = ps.executeUpdate();
            if (cont > 0) {
                b = true;
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return b;
    }

    public boolean actuDescuento(Descuento d) {
        boolean b = false;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE descuento SET ")
                .append("tiempo = ?, ")
                .append("descuento = ? ")
                .append("WHERE id_descuento = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setDouble(1, d.getTiempo());
            ps.setDouble(2, d.getDescuento());
            ps.setInt(3, d.getId_descuento());
            int cont = ps.executeUpdate();
            if (cont > 0) {
                b = true;
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return b;
    }

    public List<Descuento> descSel() {
        List<Descuento> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_descuento, ")
                .append("tiempo, ")
                .append("valor_descuento")
                .append(" FROM descuento");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Descuento d = new Descuento();
                d.setId_descuento(rs.getInt(1));
                d.setTiempo(rs.getDouble(2));
                d.setDescuento(rs.getDouble(3));
                lista.add(d);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    public String getMensaje() {
        return mensaje;
    }

}
