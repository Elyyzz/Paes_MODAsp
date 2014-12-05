/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import beans.BaseDatos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.driver.OracleTypes;

/**
 *
 * @author ElyyzZ BaRruEtA
 */
public class Procedimientos {

    BaseDatos bd;

 
    public List<BaseDatos> getCatalogos(String user, String pass, int  opc) throws SQLException, ClassNotFoundException {
        String result = "";
        int msgCodeError = -1;
        String msgDescError = "";
        CallableStatement cs = null;
        List<BaseDatos> Estados;
        Estados = new ArrayList<>();

        Conexion con = new Conexion(user, pass);
        try {  
            
            cs = con.getConnection().prepareCall("{call CATALOGOS_ASPIRANTES_PQ.GET_CATALOGO_SP(?,?,?,?)}");
            cs.setInt(1, opc);
            cs.registerOutParameter(2, OracleTypes.CURSOR);//tomas  parametro de salida de  la  base de datos           
            cs.registerOutParameter(3, OracleTypes.NUMBER);
            cs.registerOutParameter(4, OracleTypes.VARCHAR);
            cs.execute();
            result = cs.getString(4);
            ResultSet rs = (ResultSet) cs.getObject(2);
//CONVERTIR EL  CURSOR  A  UN ARRAY LIST
            while (rs.next()) {
                bd = new BaseDatos();
                bd.setClave(rs.getObject(1).toString());
                bd.setNombre(rs.getObject(2).toString());
                Estados.add(bd);
            }  
            cs.close();

        } catch (SQLException e) {
            System.out.println("Error" + e);
            con.getConnection().close();

        } finally {
        }
        return Estados;
    }
}
