/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_De_Datos;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Braya
 */
public class DaoAdministrador {

    private ConexionBD bd = new ConexionBD();
    private String mensaje;

    public Boolean ubicacionGetCodigo(String usuario, String contraseña) {
        Boolean confirmacion = false;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM")
                .append(" administrador")
                .append(" WHERE username = ?")
                .append(" AND password = ?");

        try (Connection cn = bd.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                confirmacion = true;
            } else {
                mensaje = "Usuario o Contraseña incorrectos, intentelo de nuevo";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return confirmacion;
    }
    
    public String getMensaje() {
        return mensaje;
    }
}
