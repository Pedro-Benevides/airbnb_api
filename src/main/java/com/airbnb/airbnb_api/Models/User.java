package com.airbnb.airbnb_api.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.type.descriptor.java.UUIDJavaType;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUIDJavaType uuid;

    private String name;
    private String cpf;
    private String email;
    private String password;

    @Nullable
    private String phone;
}
