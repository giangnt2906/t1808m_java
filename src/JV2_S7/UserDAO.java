package JV2_S7;

import JV2_S6.Connector;
import JV2_S6.User;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements UserDAOInterface {
    @Override
    public ArrayList<User> getUsers() {
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM user";
        ArrayList<User> list = new ArrayList<>();
        try{
            ResultSet rs = connector.getQuery(sql);
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("status")
                        );
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean saveUser(User user) {
        try{
            Connector connector = Connector.getInstance();
            String sqlInsert = "INSERT INTO user (username,email,password,status) VALUES('" +
                    user.getUsername()+"','"+
                    user.getEmail()+"','"+
                    user.getPassword()+"','"+
                    user.getStatus()+"')";
            if (connector.updateQuery(sqlInsert) > 0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        try{
            Connector connector = Connector.getInstance();
            String sqlUpdate = "UPDATE user SET username = '"+user.getUsername()+"', email = '"+user.getEmail()
                    +"', password='"+user.getPassword()+"', status = "+user.getStatus()
                    +" WHERE id="+user.getId();
            if (connector.updateQuery(sqlUpdate) > 0){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    public User load(int id){
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM user WHERE id = '"+id+"'";
        try{
            ResultSet rs = connector.getQuery(sql);
            if (rs.next()){
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("status")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
