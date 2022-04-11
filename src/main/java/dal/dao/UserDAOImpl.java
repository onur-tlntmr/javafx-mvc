package dal.dao;

import pojo.User;

import java.util.HashSet;
import java.util.Set;

public class UserDAOImpl implements UserDAO {

    Set<User> data;

    public UserDAOImpl() {

        data = new HashSet<>();
        data.add(new User("user", "1234"));
    }

    @Override
    public Boolean existUserByUsernameAndPassword(String username, String password) {
        return data.stream()
                .anyMatch(user -> user.equals(new User(username,password)));
    }
}
