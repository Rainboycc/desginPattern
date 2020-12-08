package com.clay.interpreter_pattern;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression (String[] data) {
        for (int i=0; i<data.length; i++) set.add(data[i]);
    }

    @Override
    public boolean interpreter(String info) {
        return set.contains(info);
    }
}
