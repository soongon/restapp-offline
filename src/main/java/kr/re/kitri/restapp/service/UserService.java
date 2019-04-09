package kr.re.kitri.restapp.service;

import kr.re.kitri.restapp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {



    public List<User> getAllUsers() {
        System.out.println("서비스 getAllUsers 호출됨");

        return User.users;
    }

    public User getUserByUserid(Integer userid) {

        return User.users.stream()
                .filter(user -> user.getUserid() == userid)
                .findAny()
                .orElse(new User(0, "no user with lambda"));

//        for (User user : User.users) {
//            if (user.getUserid() == userid) {
//                return user;
//            }
//        }
//        return new User(0, "no user");
    }

    public User registUser(Integer userid, String username) {
        User user = new User(userid, username);
        User.users.add(user);
        return user;
    }

    public void modifyUser(User user) {
        User.users.stream()
                .filter(item -> item.getUserid() == user.getUserid())
                .findAny()
                .orElse(new User(0, "no user"))
                .setUsername(user.getUsername());
    }

    public void removeUser(Integer userid) {
        User.users.removeIf(user -> user.getUserid() == userid);
    }
}
