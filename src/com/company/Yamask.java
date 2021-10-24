package com.company;
import ru.ifmo.se.pokemon.*;

public class Yamask extends Pokemon {
    public Yamask(String name, int level) {
        super (name, level);
        this.setMove(new SwordsDance(), new Facade(), new RockSlide());
        this.setType(Type.GHOST);
        this.setStats(38, 30, 85, 55, 65, 30);
    }
}
