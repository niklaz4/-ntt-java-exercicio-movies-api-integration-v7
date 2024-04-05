package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional getUserById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        return (User) userRepository.save(user);
    }

    public User updateUser(User user){
        return (User) userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User findById(Long id) {
        return null;
    }
}
