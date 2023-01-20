package com.rapi.rapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author leonid.barsucovschi
 */

@Getter
@Setter
@MappedSuperclass
public abstract class GeneralInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "created_at")
    protected LocalDateTime createdAt;

    @Column(name = "modified_at")
    protected LocalDateTime modifiedAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onModified(){
        this.modifiedAt = LocalDateTime.now();
    }
}
