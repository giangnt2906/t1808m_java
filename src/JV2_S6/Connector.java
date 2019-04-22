package JV2_S6;

import java.sql.*;

public class Connector {
    public Connection conn;
    public Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String Url = "jdbc:mysql://localhost:3306/t1808m";

            conn = DriverManager.getConnection(Url, "root", "");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuery(String sqlUpdate) throws Exception{
        Statement statement = conn.createStatement();
        return statement.executeUpdate(sqlUpdate);
    }
}
