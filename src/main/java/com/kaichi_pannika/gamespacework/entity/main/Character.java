package com.kaichi_pannika.gamespacework.entity.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {

    // макс левел 49
    private Integer level;

    // макс левел 10
    private Integer HP;

    private Integer force;

    private Integer dexterity;

    private Integer aerobatics;

    private Integer charisma;

    private Integer intellect;

    private Integer luck;

    private Integer trade;

    private Integer karma;
    // --

    private Long wallet;

    private Progress progress;
}
