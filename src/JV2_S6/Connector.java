package JV2_S6;

import java.sql.*;

public class Connector {
    private Connection conn;
    private static Connector instance;
    private Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String Url = "jdbc:mysql://localhost:3306/t1808m";

            conn = DriverManager.getConnection(Url, "root", "");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connector getInstance() {
        if (instance == null){
            instance = new Connector();
        }
        return instance;
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
