package com.company;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.1)
            Effect.freeze(p);
    }

    @Override
    protected String describe() {
        return "uses Blizzard";
    }
}
