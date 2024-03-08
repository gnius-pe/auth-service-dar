package app.controller;

import app.model.entity.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        System.out.println("Holassssss");
        System.out.println(user.toString());
        return ResponseEntity.ok(user);
    }
}
