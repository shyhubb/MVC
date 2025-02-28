package shyhub.vn.hub.service;

import java.util.List;

import org.aspectj.apache.bcel.classfile.JavaClass;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.stereotype.Service;

import shyhub.vn.hub.domain.User;
import shyhub.vn.hub.repository.UserRepository;

@Service
public class UserService implements Repository {
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

    public void deleteById(long id) { // xoa user bang id
        this.userRepository.deleteById(id);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public JavaClass findClass(String arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findClass'");
    }

    @Override
    public JavaClass loadClass(String arg0) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadClass'");
    }

    @Override
    public JavaClass loadClass(Class arg0) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadClass'");
    }

    @Override
    public void removeClass(JavaClass arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeClass'");
    }

    @Override
    public void storeClass(JavaClass arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'storeClass'");
    }

}
