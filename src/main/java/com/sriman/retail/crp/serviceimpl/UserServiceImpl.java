package com.sriman.retail.crp.serviceimpl;

import com.sriman.retail.crp.entity.User;
import com.sriman.retail.crp.service.UserService;
import com.sriman.retail.crp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type User service.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    public User createUser(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User updateUser(User user, Integer userId) {
        return null;
    }

    @Override
    public User getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}