package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void newUser(User user);

    void delete(int id);

    void edit(User user);

    User show(int id);

    List<User> allUsers();
}
