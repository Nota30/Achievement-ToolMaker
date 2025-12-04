package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testGetGradeA() {
        Calculator calculator = new Calculator(7, 4, Performance.FULL, ProjectLevel.MASTER, ProjectLevel.MASTER, Performance.FULL);
        Assertions.assertEquals(Grade.A, calculator.getGrade());
    }

    @Test
    public void testGetGradeB() {
        Calculator calculator = new Calculator(7, 3, Performance.FULL, ProjectLevel.STARTER, ProjectLevel.PROFICIENT, Performance.FULL);
        Assertions.assertEquals(Grade.B, calculator.getGrade());
    }

    @Test
    public void testGetGradeC() {
        Calculator calculator = new Calculator(5, 4, Performance.FULL, ProjectLevel.PROFICIENT, ProjectLevel.STARTER, Performance.NEARLY);
        Assertions.assertEquals(Grade.C, calculator.getGrade());
    }

    @Test
    public void testGetGradeD() {
        Calculator calculator = new Calculator(7, 1, Performance.FULL, ProjectLevel.UNASSESSABLE, ProjectLevel.STARTER, Performance.MINIMUM);
        Assertions.assertEquals(Grade.D, calculator.getGrade());
    }

    @Test
    public void testGetGradeF() {
        Calculator calculator = new Calculator(7, 4, Performance.OPTIONAL, ProjectLevel.MASTER, ProjectLevel.UNASSESSABLE, Performance.OPTIONAL);
        Assertions.assertEquals(Grade.F, calculator.getGrade());
    }
}
