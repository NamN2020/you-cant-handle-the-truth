import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
/*
    Nam Nguyen
    11/21/20
    CSS 143B
    Quiz 2

    Sources: https://stackoverflow.com/questions/15797446/how-do-i-add-values-to-a-set-inside-a-map
 */

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount("yes");
    }

    @Test
    public void testWordCount() {
        String[] inputs = {
                "Four Three",
                // {"son we live in a world that has walls and those walls have to be guarded by men with guns " +
                // "whos gonna do it you you lieutenant weinberg i have a greater responsibility than you " +
                // "can possibly fathom you weep for santiago and you curse the marines you have that luxury " +
                // "you have the luxury of not knowing what i know that santiagos death while tragic probably" +
                // " saved lives and my existence while grotesque and incomprehensible to you saves lives"}
        };


        TreeMap<Integer, Set<String>> testMap = new TreeMap<Integer, Set<String>>();
        Set<String> oneWord = new HashSet<String>();
        oneWord.add("Four");
        oneWord.add("Three");
        testMap.put(1, oneWord);

        TreeMap<Integer, Set<String>> testMap2 = new TreeMap<Integer, Set<String>>();
        Set<String> oneWord2 = new HashSet<String>();

        //TreeMap<Integer, Set<String>>[] expected = {testMap};

        ArrayList<TreeMap<Integer, Set<String>>> arrayTing = new ArrayList<TreeMap<Integer, Set<String>>>();
        arrayTing.add(testMap);

        TreeMap<Integer, Set<String>> temp = HandleTruth.wordCount(inputs[0]);

        assertEquals(testMap, temp);

        for (int i = 0; i < inputs.length; i++) {
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(inputs[i]);
            TreeMap<Integer, Set<String>> expected = arrayTing.get(i);

            assertEquals(expected, actual);
        }

    }
}