package com.clay.interpreter_pattern;

public class Context {

    private String[] cities = { "韶关", "广州" };
    private String[] person = { "老人", "妇女", "儿童" };

    private Expression cityPerson;

    public Context () {
        Expression cityExpression = new TerminalExpression(cities);
        Expression personExpression = new TerminalExpression(person);
        cityPerson = new AndExpression(cityExpression, personExpression);
    }

    public void freeRide (String info) {
        if (cityPerson.interpreter(info)) System.out.println("您是" + info + "，您本次乘车免费！");
        else System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
    }
}
