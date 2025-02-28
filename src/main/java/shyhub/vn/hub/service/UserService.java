package shyhub.vn.hub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import shyhub.vn.hub.domain.User;
import shyhub.vn.hub.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String Handdelhello() {
        return "HEllooo";
    }

    public User handUser(User user) {
        return this.userRepository.save(user); // service save user len database
    }

    public List<User> getUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public List findUserById(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User findById(long id) {
        return this.userRepository.findById(id);
    }

}
