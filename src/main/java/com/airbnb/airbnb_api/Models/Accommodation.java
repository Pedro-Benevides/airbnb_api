package com.airbnb.airbnb_api.Models;

import java.io.Serializable;
import java.math.BigDecimal;

import org.hibernate.type.descriptor.java.UUIDJavaType;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "accomodation")
public class Accommodation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUIDJavaType uuid;

    private String cep;
    private String street;
    private String number;

    @Nullable
    private String complement;

    private BigDecimal daily_rate;

}
