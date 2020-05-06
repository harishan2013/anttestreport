import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testConcatenate() {
        Hello hello = new Hello();

        String result = hello.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
