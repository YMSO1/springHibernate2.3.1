package ru.solodilov.servis;

import ru.solodilov.model.User;

import java.util.List;

public interface UserService {
    List<User> index();

    User show(int id);

    void save(User user);

    void delete(int id);

    void update(int id, User user);
}
