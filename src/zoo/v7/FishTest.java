package zoo.v7;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FishTest {
    
    private static Fish fish1;
    private static Fish fish2;
    
    @BeforeEach
    void setUp() {
        fish1 = new Fish("Fish1", 30, true);
        fish2 = new Fish("Fish2", 20, false);
    }
    
    // Test for Bird Class
    
    @Test
    void testGetWorth() {
        assertEquals(fish1.getWorth(), 90);
        assertEquals(fish2.getWorth(), 20);
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
