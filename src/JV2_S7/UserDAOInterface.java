package JV2_S7;

import JV2_S6.User;

import java.util.ArrayList;

public interface UserDAOInterface {
    ArrayList<User> getUsers();
    boolean saveUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(User user);
}
