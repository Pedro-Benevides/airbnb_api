package com.airbnb.airbnb_api.Models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "rent")
public class Rent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUIDJavaType uuid;

    private Date initial_date;
    private Date final_date;
    private BigDecimal value;

    @Nullable
    private Boolean checkin;
    @Nullable
    private Boolean canceled;
    @Nullable
    private BigDecimal fee_value;
}
