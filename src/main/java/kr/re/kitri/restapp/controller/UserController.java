package kr.re.kitri.restapp.controller;

import kr.re.kitri.restapp.model.User;
import kr.re.kitri.restapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{userid}")
    public User getUserByUserid(@PathVariable("userid") Integer userid) {
        return userService.getUserByUserid(userid);
    }
    @PostMapping("")
    public User registUser() {
        return null;
    }
    @PutMapping("")
    public User modifyUser() {
        return null;
    }
    @DeleteMapping("")
    public User removeUser() {
        return null;
    }
}
