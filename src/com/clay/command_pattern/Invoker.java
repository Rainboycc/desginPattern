package com.clay.command_pattern;

public class Invoker {
    private Command command;

    public Invoker (Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void cell () {
        this.command.execute();
    }
}
