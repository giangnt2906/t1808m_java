package JV2_S5;

import java.sql.*;

public class Main {

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1808m";
            Connection conn = DriverManager.getConnection(URL, "t1808m", "Nhimbi1997");

            Statement statement = conn.createStatement();

            String insert_sql = "INSERT INTO student (name,age,mark) VALUES ('Le Van C', '33', '2')";
            statement.executeUpdate(insert_sql);

            String sql = "SELECT * FROM student";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println("ID: "+rs.getString("id"));
                System.out.println("Name: "+rs.getString("name"));
                System.out.println("Age: "+rs.getString("age"));
                System.out.println("Mark: "+rs.getString("mark"));
            }
        } catch (Exception e){
            System.out.println("loi "+e);
        }
    }
}
