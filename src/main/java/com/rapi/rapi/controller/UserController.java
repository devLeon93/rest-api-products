package com.rapi.rapi.controller;

import com.rapi.rapi.dto.UserDTO;
import com.rapi.rapi.model.User;
import com.rapi.rapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leonid.barsucovschi
 */
@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll() {
        List<UserDTO> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable("id") Long id) {
        UserDTO userDTO = userService.getUserById(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

}
