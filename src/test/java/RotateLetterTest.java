import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RotateLetterTest {

    RotateLetter rotater = new RotateLetter();

    @Test
    public void test_rot13() {
        String inputStr = "cheer";
        int inputNum = 7;

        String output = "jolly";

        assertEquals(output, rotater.rotate(inputStr, inputNum));
    }

    @Test
    public void test_rot13_again() {
        String inputStr = "sleep";
        int inputNum = 9;

        String output = "bunny";

        assertEquals(output, rotater.rotate(inputStr, inputNum));
    }

    @Test
    public void test_rot13_negative() {
        String inputStr = "melon";
        int inputNum = -10;

        String output = "cubed";

        assertEquals(output, rotater.rotate(inputStr, inputNum));
    }

}
