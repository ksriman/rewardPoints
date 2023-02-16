package com.sriman.retail.crp.service;

import com.sriman.retail.crp.dto.TheeMonthRewards;
import com.sriman.retail.crp.dto.UserOrderDTO;

import javax.validation.Valid;
import java.util.List;

/**
 * The interface User order service.
 */
public interface UserOrderService {

    /**
     * Create order user order dto.
     *
     * @param userOrderDTO the user order dto
     * @return the user order dto
     */
    UserOrderDTO createOrder(@Valid UserOrderDTO userOrderDTO);

    /**
     * Update user user order dto.
     *
     * @param userOrderDTO the user order dto
     * @param id           the id
     * @return the user order dto
     */
    UserOrderDTO updateUser(UserOrderDTO userOrderDTO, Integer id);

    /**
     * Gets user by id.
     *
     * @param userId the user id
     * @return the user by id
     */
    UserOrderDTO getUserById(Integer userId);

    /**
     * Gets all users.
     *
     * @return the all users
     */
    List<UserOrderDTO> getAllUsers();

    /**
     * Gets all orders.
     *
     * @return the all orders
     */
    List<UserOrderDTO> getAllOrders();

    /**
     * Gets all reward month wise.
     *
     * @return the all reward month wise
     */
    List<TheeMonthRewards>  getAllRewardMonthWise();
}
