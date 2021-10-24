package com.company;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class SignalBeam extends SpecialMove {
    public SignalBeam() {
        super(Type.BUG, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.1)
            Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "uses SignalBeam";
    }
}
