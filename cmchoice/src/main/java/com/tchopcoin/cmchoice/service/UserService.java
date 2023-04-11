
package com.tchopcoin.cmchoice.service;

import com.tchopcoin.cmchoice.model.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public User findUserById(Long id);

    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long id);

}