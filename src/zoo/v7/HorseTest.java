package zoo.v7;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// give horses a higher max age!!
// horse age 5 double fix!!

class HorseTest {
    
    private static Horse horse1;
    
    @BeforeEach
    void setUp() {
       horse1 = new Horse("horse1", 1000, "Race1");
    }
    
    // Test for Bird Class
    
    @Test
    void testGetWorth() {
        // 0 - 4
        assertEquals(horse1.getWorth(), 500);
        horse1.getOlder(); //1
        assertEquals(horse1.getWorth(), 500);
        horse1.getOlder(); //2
        assertEquals(horse1.getWorth(), 500);
        horse1.getOlder(); //3
        assertEquals(horse1.getWorth(), 500);
        horse1.getOlder(); //4
        assertEquals(horse1.getWorth(), 500);
        
        // 5 - 10
        horse1.getOlder(); //5
        assertEquals(horse1.getWorth(), 2000);
        horse1.getOlder(); //6
        assertEquals(horse1.getWorth(), 2000);
        horse1.getOlder(); //7
        assertEquals(horse1.getWorth(), 2000);
        horse1.getOlder(); //8
        assertEquals(horse1.getWorth(), 2000);
        horse1.getOlder(); //9
        assertEquals(horse1.getWorth(), 2000);
        horse1.getOlder(); //10
        assertEquals(horse1.getWorth(), 2000);
        
        // 11 - xx
        horse1.getOlder(); //11
        assertEquals(horse1.getWorth(), 1000);
        horse1.getOlder(); //12
        assertEquals(horse1.getWorth(), 1000);
    }
    
    // Tests for Animal Class
    
    @Test
    void testGetOlder() {
        // not necessary due to BirdTest 
    }
    
    @Test
    void testFeed() {
     // not necessary due to BirdTest 
    }

}
