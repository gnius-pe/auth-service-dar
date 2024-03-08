package app.controller;

import app.model.entity.User;
import app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> finById(@PathVariable String id){
        return  userService.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public User deleteById(@PathVariable String id){
        return userService.deleteById(id);
    }
}
