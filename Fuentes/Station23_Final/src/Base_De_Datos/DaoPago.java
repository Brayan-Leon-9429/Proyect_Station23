package Base_De_Datos;

import clases.Pago;
import clases.Vehiculo;
import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class DaoPago {

    private final ConexionBD conexionBD = new ConexionBD();
    private String mensaje;

    public String pagoIns(Pago pago) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(pago.getHora_pago());
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO pago( ")
                .append("id_pago,")
                .append("modalidad,")
                .append("pago_total,")
                .append("hora_pago")
                .append(") VALUES (?,?,?,?) ");
        try (Connection c = conexionBD.getConexion()) {
            PreparedStatement ps = c.prepareStatement(sql.toString());
            ps.setString(1, pago.getId_pago());
            ps.setString(2, pago.getModalidad());
            ps.setDouble(3, pago.getPago_total());
            ps.setString(4, formattedDate);
            int resultadoInsert = ps.executeUpdate();
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

    public Pago pagoGet(String idPago) {
        Pago p = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_pago, ")
                .append("modalidad, ")
                .append("pago_total, ")
                .append("hora_pago")
                .append(" FROM pago")
                .append(" WHERE id_pago = ?");
        try (Connection cn = conexionBD.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, idPago);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new Pago();
                p.setId_pago(rs.getString(1));
                p.setModalidad(rs.getString(2));
                p.setPago_total(rs.getDouble(3));
                p.setHora_pago(rs.getTimestamp(4));
            } else {
                mensaje = "Sin datos";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return p;
    }

    public String idPago() {
        String id_pago = null;
        Random rand = new Random();
        String prefix = "PAGO-";
        do {
            int randomNum = rand.nextInt(90000) + 10000;
            id_pago = prefix + randomNum;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ")
                    .append("id_pago ")
                    .append("FROM pago ")
                    .append("WHERE id_pago = ?");
            try (Connection cn = conexionBD.getConexion()) {
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ps.setString(1, id_pago);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    break;
                }
            } catch (SQLException e) {
                mensaje = e.getMessage();
            }
        } while (true);
        return id_pago;
    }

    public String getMensaje() {
        return mensaje;
    }

}
