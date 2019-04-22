package JV2_S5;
import java.sql.*;
import java.util.Scanner;

public class BTVN {
    public static final int DEACTIVE =0;
    public static final int ACTIVE =0;

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1808m";
            Connection conn = DriverManager.getConnection(URL, "root", "");

            boolean stop = false;
            while (!stop){
                System.out.println("Menu chuc nang");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Xem danh sach");
                System.out.println("4. Xoa nguoi dung");
                System.out.println("5. Thoat ra");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chon chuc nang: ");
                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                if (menu>0 && menu<6) {
                    switch (menu) {
                        case 1: while (!login(conn)){
                                    System.out.println("Dang nhap sai, vui long dang nhap lai");
                                }
                                System.out.println("Dang nhap thanh cong");
                                break;
                        case 2: register(conn); break;
                        case 3: list(conn); break;
                        case 4: delete(conn); break;
                        case 5: stop=true; break;
                    }
                }
            }

        } catch (Exception e){
            System.out.println("Loi "+e);
        }
    }

    public static void delete(Connection conn) throws  Exception{
        Statement statement = conn.createStatement();

        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Nhap id can xoa: ");
        if (scanner.hasNextInt()){
            id = scanner.nextInt();
            String sql = "UPDATE user SET status = '"+DEACTIVE+"' WHERE id = '"+id+"'";
            //String sql = "DELETE FROM user WHERE id ='"+id+"'";
            if (statement.executeUpdate(sql) >0){
                System.out.println("Chuyen trang thai ve deactive");
                return;
            }
            System.out.println("Khong tim duoc user co id = "+id);
            return;
        }
        System.out.println("Nhap sai");
    }

    public static void list(Connection conn) throws Exception{
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM user";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            System.out.println("ID: "+rs.getString("id"));
            System.out.println("Username: "+rs.getString("username"));
            System.out.println("Email: "+rs.getString("email"));
            System.out.println("Password: "+rs.getString("password"));
            System.out.println("Status: "+rs.getString("status"));
        }
    }

    public static void register(Connection conn) throws Exception{
        Statement statement = conn.createStatement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Status: ");
        int status = scanner.nextInt();

        String insert_sql = "INSERT INTO user (username, email, password, status) VALUES ('"+username+"', '"+email+"', '"+password+"', '"+status+"')";
        statement.executeUpdate(insert_sql);
        System.out.println("Dang ky thanh cong");
    }

    public static void checklogin(Connection conn) throws Exception{

    }

    public static boolean login(Connection conn) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Statement statement = conn.createStatement();


            System.out.println("Username: ");
            String username = scanner.nextLine();
            System.out.println("Password: ");
            String password = scanner.nextLine();

            String sql = "SELECT * FROM user WHERE username = '" + username+"'" + " AND password = '" + password+"'";
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
    }
}
