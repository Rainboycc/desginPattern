package com.clay.visitor_pattern;

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
