package com.rapi.rapi.maper;

import com.rapi.rapi.dto.UserDTO;
import com.rapi.rapi.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * @author leonid.barsucovschi
 */
@Component
@RequiredArgsConstructor
public class UserDtoMapper {

    private final ProductDtoMapper productDtoMapper;

    public UserDTO mapToUser(User user){

        final UserDTO userDTO = new UserDTO();

        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());

        userDTO.setProducts(user.getProducts()
                .stream().map(productDtoMapper::mapToProduct).collect(Collectors.toList()));

        return userDTO;
    }
}
