import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJUnitTest {


    @Test
    void firstTest () {
        System.out.println("###    firstTest()");
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void secondTest () {
        System.out.println("###    secondTest ()");
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void thirdTest () {
        System.out.println("###    thirdTest ()");
        Assertions.assertTrue(3 > 2);
    }
}
