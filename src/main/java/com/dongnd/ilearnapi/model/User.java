package com.dongnd.ilearnapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    private String password;
    @Column(name = "create_date")
    private Date createdDate;
    @Column(name = "update_date")
    private Date updatedDate;
}
