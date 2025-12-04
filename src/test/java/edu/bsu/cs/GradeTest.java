package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    public void testGetGrade() {
        Grade grade = Grade.A;
        Assertions.assertEquals(4, grade.getGrade());
    }
}
