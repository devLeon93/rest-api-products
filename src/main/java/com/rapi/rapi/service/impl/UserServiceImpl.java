package com.rapi.rapi.service.impl;

import com.rapi.rapi.dto.UserDTO;
import com.rapi.rapi.exception.UserNotExistException;
import com.rapi.rapi.maper.UserDtoMapper;
import com.rapi.rapi.model.User;
import com.rapi.rapi.repository.UserRepository;
import com.rapi.rapi.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author leonid.barsucovschi
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserDtoMapper userDtoMapper;


    @Override
    public List<UserDTO> getAllUsers() {
        final List<User> users = userRepository.findAll();
        return users.stream().map(userDtoMapper::mapToUser).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userRepository.findById(id).map(userDtoMapper::mapToUser).orElseThrow(
                ()-> new EntityNotFoundException("User with id" + id + " does not exist!")
        );
    }

    @Override
    public void createUser(User userInput) {
        Optional<User> userByUsername = userRepository.findByUsername(userInput.getUsername());

        if(userByUsername.isPresent()){
            throw new UserNotExistException(
                    "The user " + userInput.getUsername() + " already exist. Please check credentials");

        }
        User user = new User();
        user.setUsername(userInput.getUsername());
        user.setEmail(userInput.getEmail());
        user.setPassword(userInput.getPassword());

        userRepository.save(user);

    }
}
