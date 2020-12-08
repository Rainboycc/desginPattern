package com.clay.interpreter_pattern;

public class AndExpression implements Expression {

    private Expression cities;
    private Expression person;

    public AndExpression (Expression cities, Expression person) {
        this.cities = cities;
        this.person = person;
    }

    @Override
    public boolean interpreter(String info) {
        String[] str = info.split("的");
        return cities.interpreter(str[0]) && person.interpreter(str[1]);
    }
}
