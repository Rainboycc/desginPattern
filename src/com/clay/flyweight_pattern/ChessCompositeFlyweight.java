package com.clay.flyweight_pattern;

public class ChessCompositeFlyweight implements  ChessInterface {

    private ChessInterface chess;

    public void add(ChessInterface chess) {
        this.chess = chess;
    }

    @Override
    public void move(int x, int y) {
        chess.move(x, y);
    }
}
