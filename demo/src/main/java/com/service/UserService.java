package com.service;

import java.util.List;

import com.model.User;
import com.repository.UserRepository;
import com.model.NotFoundEntityException;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new NotFoundEntityException(String.format("Пользователь с id %s не существует",id)));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}





