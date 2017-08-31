package by.Vitali.javaCourse2.Mod1EX1EX2EX3EX4;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by viivpo2010 on 31.8.17.
 */
public class ExampleForTestsTest {
    private ExampleForTests example;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Show before test");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("Show after test");
    }

    @Before
    public  void beforeTest(){
        example = new ExampleForTests();
    }

    @After
    public  void afterTest(){
        example = null;
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(54,example.sum(45,9));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(10, example.divide(100,10));
    }

    // test exception
    @Test(expected = ArithmeticException.class)
    public void testWithException() {
        example.divide(4,0);
    }

    @Test
    public void testMultiple() throws Exception {
        assertEquals(49, example.multiple(7, 7));
    }

    @Test
    public void testSubtraction() throws Exception {
        assertEquals(-4, example.subtraction(17,21));
    }

    //time test failed! If this test is here project will not compile!!!
    @Test(timeout = 1000)
    public void timeTest() {
        while (true);
    }

    @Test
    public void all() {
        assertTrue(example.sum(5, 5) == 10);
        assertTrue(example.divide(10, 5) == 2);
        assertTrue(example.multiple(5, 5) == 25);
        assertTrue(example.subtraction(5, 5) == 0);

    }
}
