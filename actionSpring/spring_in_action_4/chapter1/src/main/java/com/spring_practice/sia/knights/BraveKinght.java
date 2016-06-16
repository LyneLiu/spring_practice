package com.spring_practice.sia.knights;

/**
 * Created by nn_liu on 2016/5/26.
 */
public class BraveKinght implements Knight {

    private Quest quest;

    public BraveKinght(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
