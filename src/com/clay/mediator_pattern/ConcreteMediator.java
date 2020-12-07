package com.clay.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagues = null;

    public ConcreteMediator () {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague c, String message) {
        for (Colleague colleague : colleagues) {
            if (!colleague.equals(c)) {
                colleague.receive(message);
            }
        }
    }
}
