package com.QueryLibrary.QueryLibrary.entity;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import javax.persistence.Entity;


@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}