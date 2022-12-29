package org.acme;

class Checker {

    record Human(String name, int age, String profession) {
    }

    public String checkObject(Object obj) {
        return switch (obj) {
            case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
            case Circle c -> "This is a circle";
            case Shape s -> "It is just a shape";
            case null -> "It is null";
            default -> "It is an object";
        };
    }

    public String checkShape(Shape shape) {
        return switch (shape) {
            case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
            case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
            case WeirdTriangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
            default -> "Just a normal shape";
        };
    }

    int getNumberOfSides(Shape shape) {
        return switch (shape) {
            case WeirdTriangle t -> t.getNumberOfSides();
            case Circle c -> c.getNumberOfSides();
            case Triangle t -> t.getNumberOfSides();
            case Rectangle r -> r.getNumberOfSides();
            case Square s -> s.getNumberOfSides();
        };
    }
}
