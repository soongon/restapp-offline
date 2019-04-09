package kr.re.kitri.restapp.controller;

import kr.re.kitri.restapp.model.User;
import kr.re.kitri.restapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{userid}")
    public User getUserByUserid(@PathVariable("userid") Integer userid) {
        return userService.getUserByUserid(userid);
    }
    @PostMapping("")
    public User registUser(@RequestBody User user) {
        System.out.println(user);

        return userService.registUser(
                user.getUserid(), user.getUsername());
    }
    @PutMapping("")
    public User modifyUser(User user) {
        userService.modifyUser(user);
        return user;
    }
    @DeleteMapping("/{userid}")
    public String removeUser(@PathVariable Integer userid) {
        userService.removeUser(userid);
        return userid + "번 사용자 삭제됨";
    }
}
