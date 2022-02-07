import static org.junit.jupiter.api.Assertions.*;

import jdk.internal.org.objectweb.asm.tree.InsnList;
import org.junit.jupiter.api.*;

class GuessNumberTest {
    GuessNumber GuessNumber;

    @BeforeEach
    void setUp() {
        GuessNumber = new GuessNumber();
    }

    @Test
    void userInput() {
        String userInput = null;
        assert userInput != null;
        assertEquals("Jen", userInput.());
    }

    @Test
    void secretNum(){
        assertArrayEquals(1-20, (Math.random() * 20));
    }

    private void assertArrayEquals(int i, double v) {
    }

    @AfterEach
    void tearDown() {
    }
}