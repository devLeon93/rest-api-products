package com.rapi.rapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author leonid.barsucovschi
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product extends GeneralInfo{

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
