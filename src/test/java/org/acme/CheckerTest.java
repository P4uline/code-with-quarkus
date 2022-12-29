package org.acme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CheckerTest {
    private Checker checker = new Checker();

    @Test
    public void should_check_shapes() {
        assertEquals(checker.checkShape(new Triangle()), "Just a normal shape");
        assertEquals(checker.checkShape(new WeirdTriangle()), "This is a weird triangle");
        assertEquals(checker.checkShape(new Rectangle()), "Just a normal shape");
        assertEquals(checker.checkShape(new Circle()), "Just a normal shape");
        assertEquals(checker.checkShape(new Square()), "Just a normal shape");
    }

    @Test
    public void should_check_objects() {
        assertEquals("It is just a shape", checker.checkObject(new Triangle()));
        assertEquals("It is just a shape", checker.checkObject(new WeirdTriangle()));
        assertEquals("It is just a shape", checker.checkObject(new Rectangle()));
        assertEquals("This is a circle", checker.checkObject(new Circle()));
        assertEquals("It is just a shape", checker.checkObject(new Square()));
        assertEquals("Name: John Doe, age: 45 and profession: Developer", checker.checkObject(new Checker.Human("John Doe", 45, "Developer")));
    }

    @Test
    public void should_check_number_of_sides() {
        assertEquals(3, checker.getNumberOfSides(new Triangle()));
        assertEquals(4, checker.getNumberOfSides(new WeirdTriangle()));
        assertEquals(4, checker.getNumberOfSides(new Rectangle()));
        assertEquals(0, checker.getNumberOfSides(new Circle()));
        assertEquals(4, checker.getNumberOfSides(new Square()));
    }
}
