package org.acme;

public abstract sealed class Shape permits Triangle, Circle, WeirdTriangle, Rectangle, Square {
    public abstract int getNumberOfSides();
}

final class Triangle extends Shape {
    @Override
    public int getNumberOfSides() {
        return 3;
    }
}

final class Circle extends Shape {
    @Override
    public int getNumberOfSides() {
        return 0;
    }
}

final class WeirdTriangle extends Shape {

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

final class Rectangle extends Shape {

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

final class Square extends Shape {

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

