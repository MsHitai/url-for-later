package ru.practicum.user.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String email;
    private String name;
}