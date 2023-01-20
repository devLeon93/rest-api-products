package com.rapi.rapi.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author leonid.barsucovschi
 */
@Data
public class ProductDTO {

    private String title;

    private String description;

    private Double price;

}
