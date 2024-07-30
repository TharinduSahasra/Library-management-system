package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBconnection;

public class CrudUtil {
    public static <T> T execute(String sql, Object... params) throws Exception{
        Connection connection = DBconnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(sql);
        int i = 0;
        for (Object param : params) {
            i++;
            pstm.setObject(i, param);
        }
        if (sql.startsWith("SELECT")){
            return (T) pstm.executeQuery();     // ResultSet
        }
        return (T) ((Boolean) (pstm.executeUpdate() > 0));    // boolean
    }

}
