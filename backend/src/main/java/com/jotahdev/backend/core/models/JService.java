package com.jotahdev.backend.core.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import com.jotahdev.backend.core.enums.JIcon;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "service")
public class JService {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(name = "minimum_price", nullable = false)
    private BigDecimal minimumPrice;

    @Column(name = "hours_quantity", nullable = false)
    private Integer hoursQuantity;

    @Column(name = "commission_percentage", nullable = false)
    private BigDecimal commissionPercentage;

    @Column(name = "room_hours", nullable = false)
    private Integer roomHours;

    @Column(name = "room_price", nullable = false)
    private BigDecimal roomPrice;

    @Column(name = "living_room_hours", nullable = false)
    private Integer livingRoomHours;

    @Column(name = "living_room_price", nullable = false)
    private BigDecimal livingRoomPrice;

    @Column(name = "bath_room_hours", nullable = false)
    private Integer bathroomHours;

    @Column(name = "bath_room_price", nullable = false)
    private BigDecimal bathroomPrice;

    @Column(name = "kitchen_hours", nullable = false)
    private Integer kitchenHours;

    @Column(name = "kitchen_price", nullable = false)
    private BigDecimal kitchenPrice;

    @Column(name = "backyard_hours", nullable = false)
    private Integer backyardHours;

    @Column(name = "backyard_price", nullable = false)
    private BigDecimal backyardPrice;

    @Column(name = "others_hours", nullable = false)
    private Integer othersHours;

    @Column(name = "others_price", nullable = false)
    private BigDecimal othersPrice;

    @Column(nullable = false, length = 14)
    @Enumerated(EnumType.STRING)
    private JIcon icon;

    @Column(nullable = false)
    private Integer position;

    @CreationTimestamp
    private LocalDateTime createadAt;
}
