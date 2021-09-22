package com.minibootcamp.ada;

public class LineCalculator {

    public double calculateLineLength(int x1, int y1, int x2, int y2) {
        return Math.abs((y2 - y1) + (x2 - x1));
    }

    public static void main(String[] args) {
        LineCalculator lineCalculator = new LineCalculator();
        lineCalculator.calculateLineLength(0, 0, 0, 0);
    }
}
