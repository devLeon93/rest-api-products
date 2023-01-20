package com.rapi.rapi.dto;

import com.rapi.rapi.model.Product;
import lombok.Data;

import java.util.List;

/**
 * @author leonid.barsucovschi
 */
@Data
public class UserDTO {

    private String username;

    private String email;

    private List<ProductDTO> products;

}
