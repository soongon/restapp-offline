package kr.re.kitri.restapp.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    public static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User(100, "kim"));
        users.add(new User(101, "lee"));
        users.add(new User(102, "park"));
        users.add(new User(103, "choi"));
    }

    private Integer userid;
    private String username;

    public User(Integer userid, String username) {
        this.userid = userid;
        this.username = username;
    }


}
