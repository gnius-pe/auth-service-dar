package app.service;

import app.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final IUserRepository userRepository;

    public User save (User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(String id){
        return userRepository.findById(id);
    }

    public User deleteById(String id){
        User user = userRepository.findById(id).orElse(null);
        if(user != null){
            return null;
        }
        userRepository.deleteById(id);
        return user;
    }
}
