package com.company;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Tornadus("Amogus", 1));
        battle.addAlly(new Yamask("Vitalya", 1));
        battle.addAlly(new Cofagrigus("BigVitalya", 1));
        battle.addFoe(new Bagon("Andruha", 1));
        battle.addAlly(new Shelgon("BigAndruha", 1));
        battle.addAlly(new Salamence("VasheBigAndruhaZhest", 1));
        battle.go();
    }
}
