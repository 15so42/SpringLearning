package edu.cn;

public class BraveKnight implements  Knight{

    public Quest quest;
    public BraveKnight(Quest quest){
        this.quest=quest;
    }
    public BraveKnight(){}


    @Override
    public void embarkquest() {
    quest.embark();
    }
}
