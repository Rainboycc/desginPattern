package com.clay.oberver_pattern;

import java.util.EventObject;

public class RingEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private boolean sound;

    public RingEvent (Object source, Boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
    public boolean getSound() {
        return this.sound;
    }
}
