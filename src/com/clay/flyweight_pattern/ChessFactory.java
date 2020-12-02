package com.clay.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    private Map<String, ChessInterface> flyweightPool = null;
    private static ChessFactory chessFactory = null;

    private ChessFactory () {
        this.flyweightPool = new HashMap<String, ChessInterface>();
    }

    public static ChessFactory getInstance() {
        if (chessFactory == null) {
            chessFactory = new ChessFactory();
        }
        return chessFactory;
    }

    private ChessInterface flyweight_factory (String color) {
        ChessInterface chess = flyweightPool.get(color);
        if (chess == null) {
            System.out.println(color + "棋子被实例化...");
            chess = new ChessFlyweight(color);
            flyweightPool.put(color, chess);
        }
        return chess;
    }

    public ChessInterface factory (String color) {
        ChessCompositeFlyweight compositeFly = new ChessCompositeFlyweight();
        compositeFly.add(this.flyweight_factory(color));
        return compositeFly;
    }
}
