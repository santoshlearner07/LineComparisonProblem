package com.company;
/*
Line Comparison problem
 */

public class LineComparison {

    public static void main(String[] args) {
        Double firstLine;
        Double secondLine;

        int x1 = 10, x2 = 16, y1 = 12, y2 = 14; // for first line
        int a1 = 6, a2 = 7, b1 = 18, b2 = 9; // for second line
        firstLine = (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        secondLine = (Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2)));
        boolean equalLine = secondLine.equals(firstLine); // defines true or false by comparing
        if (equalLine == false) {
            System.out.println("First line and Second line are not Equal");
        } else System.out.println("First line and Second line are Equal");
    }
}
