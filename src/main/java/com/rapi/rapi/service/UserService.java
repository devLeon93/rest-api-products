package com.rapi.rapi.service;

import com.rapi.rapi.dto.UserDTO;
import com.rapi.rapi.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author leonid.barsucovschi
 */


public interface UserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    void createUser(User userInput);







}
