import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class DetectAnagramsTest {

    DetectAnagrams detector = new DetectAnagrams();

    @Test
    public void test_no_matches() {
        String inputStr = "hello world zombies pants";
        String input[] = inputStr.split(" ");

        String target = "diaper";
        String output[] = {};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_detect_simple_anagram() {
        String inputStr = "tan stand at";
        String input[] = inputStr.split(" ");

        String target = "ant";
        String output[] = {"tan"};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_detect_multiple_anagrams() {
        String inputStr = "stream pigeon maters";
        String input[] = inputStr.split(" ");

        String target = "master";
        String output[] = {"stream", "maters"};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_does_not_confuse_different_duplicates() {
        String inputStr = "eagle";
        String input[] = inputStr.split(" ");

        String target = "galea";
        String output[] = {};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_eliminate_anagram_subsets() {
        String inputStr = "dog goody";
        String input[] = inputStr.split(" ");

        String target = "good";
        String output[] = {};

        assertArrayEquals(output, detector.detect(target, input));
    }


    @Test
    public void test_detect_anagram() {
        String inputStr = "enlists google inlets banana";
        String input[] = inputStr.split(" ");

        String target = "listen";
        String output[] = {"inlets"};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_multiple_anagrams() {
        String inputStr = "gallery ballerina regally clergy largely leading";
        String input[] = inputStr.split(" ");

        String target = "allergy";
        String output[] = {"gallery", "regally", "largely"};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_anagrams_are_case_insensitive() {
        String inputStr = "cashregister Carthorse radishes";
        String input[] = inputStr.split(" ");

        String target = "Orchestra";
        String output[] = {"Carthorse"};

        assertArrayEquals(output, detector.detect(target, input));
    }

    @Test
    public void test_same_word_isnt_anagram() {
        String inputStr = "go Go GO";
        String input[] = inputStr.split(" ");

        String target = "go";
        String output[] = {};

        assertArrayEquals(output, detector.detect(target, input));
    }
}
