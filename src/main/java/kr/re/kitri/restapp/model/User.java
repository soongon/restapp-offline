package kr.re.kitri.restapp.model;

import java.util.ArrayList;
import java.util.List;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }
}
