package kr.re.kitri.restapp.service;

import kr.re.kitri.restapp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserByUserid(Integer userid);

    User registUser(Integer userid, String username);

    void modifyUser(User user);

    void removeUser(Integer userid);
}
