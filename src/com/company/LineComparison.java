package com.company;

public class LineComparison {
    public static void main(String[] args) {
        Double firstLine;
        int x1 = 1, x2 = 5, y1 = 1, y2 = 5; //value assigned
        firstLine = (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("The dist between two points:- " + String.format("%.2f",firstLine) );
    }
}
