package com.clay.iterator_pattern;

public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator getIterator();
}
