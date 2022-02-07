import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DragonCave2Test {
    DragonCave2 DragonCave2;

    @BeforeEach
    void setUp() {
        DragonCave2 = new DragonCave2();
    }

    @Test
    void cave() {
        String cave = null;
        assertEquals(1, Integer.parseInt(cave), "Wrong Input");
        assertEquals(2, Integer.parseInt(cave), "Wrong Input");
    }

    @AfterEach
    void tearDown() {
    }
}