package Test2;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/ktra";
            Connection conn = DriverManager.getConnection(URL, "root", "");

            ArrayList<Book> list = new ArrayList<>();

            boolean stop = false;
            while (!stop) {
                System.out.println("Menu:");
                System.out.println("1. Add book records");
                System.out.println("2. Save");
                System.out.println("3. Display book records");
                System.out.println("4. Exit");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chon 1 chuc nang: ");
                int menu = scanner.hasNextInt() ? scanner.nextInt() : 0;
                if (menu > 0 && menu < 5) {
                    switch (menu) {
                        case 1:
                            scanner.nextLine();
                            System.out.println("Book name: ");
                            String name = scanner.nextLine();
                            System.out.println("Author: ");
                            String author = scanner.nextLine();
                            System.out.println("Price: ");
                            Double price = scanner.nextDouble();
                            list.add(new Book(name, author, price));
                            System.out.println("Sach trong danh sach da nhap la:");
                            for (Book bk: list){
                                System.out.println(bk.bname+"---"+bk.author+"---"+bk.price);
                            }
                            break;
                        case 2:
                            add(conn, list);
                            break;
                        case 3:
                            display(conn);
                            break;
                        case 4:
                            stop = true;
                            break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void display(Connection conn) throws Exception {
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM book";
        System.out.println("Book ID             Book Name               Author          Price");
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.print("B_" + rs.getString("id"));
            System.out.print("-------------" + rs.getString("name"));
            System.out.print("-------------" + rs.getString("author"));
            System.out.print("-------------$" + rs.getString("price"));
            System.out.println("");
        }
    }

    public static void add(Connection conn, ArrayList<Book> list) throws Exception{
        Statement statement = conn.createStatement();

        for (Book bk: list) {
            String insert_sql = "INSERT INTO book (name, author, price) VALUES ('" + bk.bname + "', '" + bk.author + "', '" + bk.price + "')";
            statement.executeUpdate(insert_sql);
        }

        System.out.println("Da luu thanh cong "+list.size()+" sach");
    }
}
