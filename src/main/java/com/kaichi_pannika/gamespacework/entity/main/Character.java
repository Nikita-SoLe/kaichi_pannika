package com.kaichi_pannika.gamespacework.entity.main;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // макс левел 49
    @Column(name = "level", nullable = false)
    private Integer level;

    // макс левел 10
    @Column(name = "hp", nullable = false)
    private Integer HP;

    @Column(name = "force", nullable = false)
    private Integer force;

    @Column(name = "dexterity", nullable = false)
    private Integer dexterity;

    @Column(name = "aerobatics", nullable = false)
    private Integer aerobatics;

    @Column(name = "charisma", nullable = false)
    private Integer charisma;

    @Column(name = "intellect", nullable = false)
    private Integer intellect;

    @Column(name = "luck", nullable = false)
    private Integer luck;

    @Column(name = "trade", nullable = false)
    private Integer trade;

    @Column(name = "karma", nullable = false)
    private Integer karma;
    // --

    @Column(name = "wallet", nullable = false)
    private Long wallet;

//    private Progress progress;
}
