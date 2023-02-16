package com.sriman.retail.crp.service;

import com.sriman.retail.crp.entity.User;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {
    /**
     * Create user user.
     *
     * @param user the user
     * @return the user
     */
    User createUser(User user);

    /**
     * Update user user.
     *
     * @param user   the user
     * @param userId the user id
     * @return the user
     */
    User updateUser(User user, Integer userId);

    /**
     * Gets user by id.
     *
     * @param userId the user id
     * @return the user by id
     */
    User getUserById(Integer userId);

    /**
     * Gets all users.
     *
     * @return the all users
     */
    List<User> getAllUsers();
}
