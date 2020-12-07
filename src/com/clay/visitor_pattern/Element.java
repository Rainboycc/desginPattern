package com.clay.visitor_pattern;

public interface Element {
    void accept(Visitor visitor);
}
