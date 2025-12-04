package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void testGetPerformance() {
        Performance performance = Performance.FULL;
        Assertions.assertEquals(3, performance.getPerformance());
    }
}
