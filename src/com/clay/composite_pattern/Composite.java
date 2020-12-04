package com.clay.composite_pattern;

import java.util.ArrayList;

public class Composite implements  Component{

    private ArrayList<Component> children;

    public Composite () {
        this.children = new ArrayList<Component>();
    }


    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component component: children) {
            component.operation();
        }
    }
}
