package com.tchopcoin.cmchoice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tchopcoin.cmchoice.model.User;
import com.tchopcoin.cmchoice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();

    }

    @Override
    public User findUserById(Long id) {
        Optional<User> userOption = userRepository.findById(id);
        if (userOption.isEmpty()) {
            return null;
        } else {
            return userOption.get();
        }
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);

    }

    @Override
    public User updateUser(User user) {
        Optional<User> userOption = userRepository.findById(user.getId());
        if (userOption.isEmpty()) {
            return null;
        } else {
            return userRepository.save(user);
        }

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
