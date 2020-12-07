package com.clay.mediator_pattern;

public interface Mediator {
    void register (Colleague colleague);
    void relay (Colleague c, String message);
}
