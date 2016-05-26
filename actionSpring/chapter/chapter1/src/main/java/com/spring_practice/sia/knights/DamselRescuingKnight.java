package com.spring_practice.sia.knights;

/**
 * Created by nn_liu on 2016/5/26.
 */
public class DamselRescuingKnight implements Knight {

    private Quest quest;

    public DamselRescuingKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
