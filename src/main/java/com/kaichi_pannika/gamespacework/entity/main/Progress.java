package com.kaichi_pannika.gamespacework.entity.main;

import com.kaichi_pannika.gamespacework.entity.quests.Quest;
import com.kaichi_pannika.gamespacework.entity.ships.Ship;

import java.util.Map;

public class Progress {

    private Map<String, Ship> garage;

    private Map<String, Implant> implants;

    private Map<String, Quest> magazineQuests;
}
