package com.clay.flyweight_pattern;

public class ChessFlyweight implements ChessInterface {

    private String color;

    public ChessFlyweight (String color) {
        this.color = color;
    }


    @Override
    public void move(int x, int y) {
        System.out.println("棋子" + this.color + "在（" + x + ", " + y + ")处落子");
    }
}
