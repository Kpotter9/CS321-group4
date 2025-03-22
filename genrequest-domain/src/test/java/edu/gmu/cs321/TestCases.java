package edu.gmu.cs321;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCases {
    Form form;

    @BeforeAll
    public void setUpBeforeClass() {
        form = new Form();
    }
    /* Kyles made this test
     * Test name
     */
    @Test
    public void testName() {
        form.setName("John Doe");
        assertEquals("John Doe", form.getName());
    }
    
}
