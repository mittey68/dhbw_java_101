package zoo.v7;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTest {
    
    private static Bird bird1;
    private static Bird bird2;
    private static Bird bird3;
    
    @BeforeEach
    void setUp() {
        bird1 = new Bird("Bird1", 35, Color.YELLOW);
        bird2 = new Bird("Bird2", 20, Color.GREEN);
        bird3 = new Bird("Bird3", 15, Color.RED);
    }
    
    // Test for Bird Class
    
    @Test
    void testGetWorth() {
        assertEquals(bird1.getWorth(), 350);
        assertEquals(bird2.getWorth(), 40);
        assertEquals(bird3.getWorth(), 15);
    }
    
    // Tests for Animal Class
    
    @Test
    void testGetOlder() {
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 0);
        bird1.getOlder(); //1
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 1);
        bird1.getOlder(); //2
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 2);
        bird1.getOlder(); //3
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 3);
        bird1.getOlder(); //4
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 4);
        bird1.getOlder(); //5
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 5);
        bird1.getOlder(); //6
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 6);
        bird1.getOlder(); //7
        assertTrue(bird1.getAlive());
        assertEquals(bird1.getAge(), 7);
        bird1.getOlder(); //8
        assertFalse(bird1.getAlive());
        assertEquals(bird1.getAge(), 7);
    }
    
    @Test
    void testFeed() {
        assertEquals(bird1.feed(), 5);
    }

}
