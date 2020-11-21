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
                "son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you",
                "what we think we become",
                "whatever you do do it well",
                "one two two three three three four four four four five five five five five six six six six six six seven seven seven seven seven seven seven eight eight eight eight eight eight eight eight nine nine nine nine nine nine nine nine nine ten ten ten ten ten ten ten ten ten ten",
                "you have brains in your head you have feet in your shoes you can steer yourself any direction you choose",
                ""
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

        // TEST CASE 1
        TreeMap<Integer, Set<String>> testCase1 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase1oneWord = new HashSet<String>();
        testCase1oneWord.add("weinberg");
        testCase1oneWord.add("whos");
        testCase1oneWord.add("be");
        testCase1oneWord.add("guns");
        testCase1oneWord.add("lieutenant");
        testCase1oneWord.add("do");
        testCase1oneWord.add("we");
        testCase1oneWord.add("that");
        testCase1oneWord.add("guarded");
        testCase1oneWord.add("son");
        testCase1oneWord.add("world");
        testCase1oneWord.add("responsibility");
        testCase1oneWord.add("and");
        testCase1oneWord.add("by");
        testCase1oneWord.add("men");
        testCase1oneWord.add("than");
        testCase1oneWord.add("has");
        testCase1oneWord.add("greater");
        testCase1oneWord.add("live");
        testCase1oneWord.add("those");
        testCase1oneWord.add("in");
        testCase1oneWord.add("gonna");
        testCase1oneWord.add("i");
        testCase1oneWord.add("it");
        testCase1oneWord.add("with");
        testCase1oneWord.add("to");
        testCase1.put(1, testCase1oneWord);

        Set<String> testCase1twoWords = new HashSet<String>();
        testCase1twoWords.add("a");
        testCase1twoWords.add("walls");
        testCase1twoWords.add("have");
        testCase1.put(2, testCase1twoWords);

        Set<String> testCase1threeWords = new HashSet<String>();
        testCase1threeWords.add("you");
        testCase1.put(3, testCase1threeWords);

        //  TEST CASE 2
        TreeMap<Integer, Set<String>> testCase2 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase2oneWord = new HashSet<String>();
        testCase2oneWord.add("what");
        testCase2oneWord.add("think");
        testCase2oneWord.add("become");
        testCase2.put(1, testCase2oneWord);

        Set<String> testCase2twoWords = new HashSet<String>();
        testCase2twoWords.add("we");
        testCase2.put(2, testCase2twoWords);


        //  TEST CASE 3
        TreeMap<Integer, Set<String>> testCase3 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase3oneWord = new HashSet<String>();
        testCase3oneWord.add("whatever");
        testCase3oneWord.add("you");
        testCase3oneWord.add("it");
        testCase3oneWord.add("well");
        testCase3.put(1, testCase3oneWord);

        Set<String> testCase3twoWords = new HashSet<String>();
        testCase3twoWords.add("do");
        testCase3.put(2, testCase3twoWords);

        //  TEST CASE 4
        TreeMap<Integer, Set<String>> testCase4 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase4oneWord = new HashSet<String>();
        testCase4oneWord.add("one");
        testCase4.put(1, testCase4oneWord);

        Set<String> testCase4twoWords = new HashSet<String>();
        testCase4twoWords.add("two");
        testCase4.put(2, testCase4twoWords);

        Set<String> testCase4threeWords = new HashSet<String>();
        testCase4threeWords.add("three");
        testCase4.put(3, testCase4threeWords);

        Set<String> testCase4fourWords = new HashSet<String>();
        testCase4fourWords.add("four");
        testCase4.put(4, testCase4fourWords);

        Set<String> testCase4fiveWords = new HashSet<String>();
        testCase4fiveWords.add("five");
        testCase4.put(5, testCase4fiveWords);

        Set<String> testCase4sixWords= new HashSet<String>();
        testCase4sixWords.add("six");
        testCase4.put(6, testCase4sixWords);

        Set<String> testCase4sevenWords = new HashSet<String>();
        testCase4sevenWords.add("seven");
        testCase4.put(7, testCase4sevenWords);

        Set<String> testCase4eightWords = new HashSet<String>();
        testCase4eightWords.add("eight");
        testCase4.put(8, testCase4eightWords);

        Set<String> testCase4nineWords = new HashSet<String>();
        testCase4nineWords.add("nine");
        testCase4.put(9, testCase4nineWords);

        Set<String> testCase4tenWords = new HashSet<String>();
        testCase4tenWords.add("ten");
        testCase4.put(10, testCase4tenWords);

        //  TEST CASE 5
        TreeMap<Integer, Set<String>> testCase5 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase5oneWord = new HashSet<String>();
        testCase5oneWord.add("head");
        testCase5oneWord.add("feet");
        testCase5oneWord.add("can");
        testCase5oneWord.add("brains");
        testCase5oneWord.add("choose");
        testCase5oneWord.add("yourself");
        testCase5oneWord.add("steer");
        testCase5oneWord.add("shoes");
        testCase5oneWord.add("any");
        testCase5oneWord.add("direction");
        testCase5.put(1, testCase5oneWord);

        Set<String> testCase5twoWords = new HashSet<String>();
        testCase5twoWords.add("in");
        testCase5twoWords.add("have");
        testCase5twoWords.add("your");
        testCase5.put(2, testCase5twoWords);

        Set<String> testCase5fourWords = new HashSet<String>();
        testCase5fourWords.add("you");
        testCase5.put(4, testCase5fourWords);

        //  TEST CASE 6
        TreeMap<Integer, Set<String>> testCase6 = new TreeMap<Integer, Set<String>>();
        Set<String> testCase6empty = new HashSet<String>();
        testCase6empty.add("");
        testCase6.put(1, testCase6empty);

        testCases.add(testCase1);
        testCases.add(testCase2);
        testCases.add(testCase3);
        testCases.add(testCase4);
        testCases.add(testCase5);
        testCases.add(testCase6);

        return testCases;
    }
}