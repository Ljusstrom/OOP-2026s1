import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main SUT;

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Ajetaan kerran ennen testejä.");
    }

    @AfterAll
    static void after() {
        System.out.println("Lopuksi ajetaan tämä.");
    }

    @BeforeEach
    void setUp() {
        SUT = new Main();
        System.out.println("Ennen yksittäistä testiä...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Yksittäisen testin jälkeen.");
    }

    @Test
    void isEven() {
        assertFalse(SUT.isEven(3));
        assertTrue(SUT.isEven(2));
        assertTrue(SUT.isEven(0));
    }

    @Test
    void isEvenNegative() {
        assertFalse(SUT.isEven(-1));
        assertTrue(SUT.isEven(-2));
    }

    @Test
    void isEvenStatic() {
        assertEquals(false, Main.isEven(1));
        assertTrue(Main.isEven(-2));
    }
}








