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

                "One Two Two",
                "son we live in a world that has walls and those walls have to be guarded by men with guns " +
                        "whos gonna do it you you lieutenant weinberg i have a greater responsibility than you"
        };


        ArrayList<TreeMap<Integer, Set<String>>> testCase = getTestCases();


        for (int i = 0; i < inputs.length; i++) {
            TreeMap<Integer, String> actual = HandleTruth.wordCount(inputs[i]);
            TreeMap<Integer, Set<String>> expected = testCase.get(i);

            assertEquals(expected, actual);
        }
    }

    public static ArrayList<TreeMap<Integer, Set<String>>> getTestCases() {
        ArrayList<TreeMap<Integer, Set<String>>> testCases = new ArrayList<TreeMap<Integer, Set<String>>>();

        TreeMap<Integer, Set<String>> testCase1 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase1oneWord = new HashSet<String>();
        testCase1oneWord.add("One");
        testCase1.put(1, testCase1oneWord);
        Set<String> testCase1twoWords = new HashSet<String>();
        testCase1twoWords.add("Two");
        testCase1.put(2, testCase1twoWords);

        TreeMap<Integer, Set<String>> testCase2 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase2oneWord = new HashSet<String>();
        testCase2oneWord.add("weinberg");
        testCase2oneWord.add("whos");
        testCase2oneWord.add("be");
        testCase2oneWord.add("guns");
        testCase2oneWord.add("lieutenant");
        testCase2oneWord.add("do");
        testCase2oneWord.add("we");
        testCase2oneWord.add("that");
        testCase2oneWord.add("guarded");
        testCase2oneWord.add("son");
        testCase2oneWord.add("world");
        testCase2oneWord.add("responsibility");
        testCase2oneWord.add("and");
        testCase2oneWord.add("by");
        testCase2oneWord.add("men");
        testCase2oneWord.add("than");
        testCase2oneWord.add("has");
        testCase2oneWord.add("greater");
        testCase2oneWord.add("live");
        testCase2oneWord.add("those");
        testCase2oneWord.add("in");
        testCase2oneWord.add("gonna");
        testCase2oneWord.add("i");
        testCase2oneWord.add("it");
        testCase2oneWord.add("with");
        testCase2oneWord.add("to");
        testCase2.put(1, testCase2oneWord);

        Set<String> testCase2twoWord = new HashSet<String>();
        testCase2twoWord.add("a");
        testCase2twoWord.add("walls");
        testCase2twoWord.add("have");
        testCase2.put(2, testCase2twoWord);

        Set<String> testCase2threeWord = new HashSet<String>();
        testCase2threeWord.add("you");
        testCase2.put(3, testCase2threeWord);

        TreeMap<Integer, Set<String>> testCase3 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase3Words = new HashSet<String>();

        TreeMap<Integer, Set<String>> testCase4 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase4Words = new HashSet<String>();

        TreeMap<Integer, Set<String>> testCase5 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase5Words = new HashSet<String>();


        testCases.add(testCase1);
        testCases.add(testCase2);
        return testCases;
    }
}