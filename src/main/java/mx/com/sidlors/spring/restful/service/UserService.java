package mx.com.sidlors.spring.restful.service;

import java.util.List;
import mx.com.sidlors.spring.restful.model.User;

public interface UserService {

    List<User> getAll();

    User findById(int id);

    User findByName(String name);

    void create(User user);

    void update(User user);

    void delete(int id);

    boolean exists(User user);
}
