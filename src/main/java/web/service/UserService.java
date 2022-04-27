package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    void newUser(User user);

    void deleteUser(int id);

    void edit(User user);

    User show(int id);

    List<User> allUsers();
}
