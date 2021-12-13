package bil387project.api.controller;

import bil387project.business.abstracts.UserService;
import bil387project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String tempDate = formatter.format(date);
        user.setRegisterDate(tempDate);
        return this.userService.addUser(user);
    }
    @PostMapping("/login")
    public User loginUser(@Valid @RequestBody User user) {
        return this.userService.login(user.getEmail(), user.getPassword());
    }

    @DeleteMapping("/delete")
    public void deleteUser(@Valid @RequestParam int userID){
        this.userService.deleteUser(userID);
    }

    @PutMapping("/update")
    public User updateUser(@Valid @RequestBody User user){
        return this.userService.updateUser(user);
    }

    @GetMapping("/getById")
    public User getUserById(@Valid @RequestParam int userID){
        return this.userService.getUserById(userID);
    }

    @GetMapping("/getByEmail")
    public User getUserByEmail(@Valid @RequestParam String email){
        return this.userService.getUserByEmail(email);
    }
}
