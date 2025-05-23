package com.project.CarRental.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    private String nameRole;
    private Date createDate;
    private String updateDate;

    private List<User> users;
    public Role(int idRole) {
        this.idRole = idRole;
    }
}
