package com.company;
import ru.ifmo.se.pokemon.*;

public class Tornadus extends Pokemon {
    public Tornadus(String name, int level){
        super (name, level);
        this.setMove(new Leer(), new Snarl(), new ShadowBall(), new Rest());
        this.setType(Type.FLYING);
        this.setStats(79, 115, 70, 125, 80, 111);

    }
}
