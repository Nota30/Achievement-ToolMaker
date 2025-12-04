package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProjectLevelTest {

    @Test
    public void testGetLevel() {
        ProjectLevel projectLevel = ProjectLevel.MASTER;
        Assertions.assertEquals(3, projectLevel.getLevel());
    }
}
