package com.clay.oberver_pattern;

import java.util.EventListener;

public interface BellEventListener extends EventListener {
    public void heardBell(RingEvent e);
}
