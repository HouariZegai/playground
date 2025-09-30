package org.zegai.algorithms.search.kmp;

import java.util.LinkedList;
import java.util.List;

/*
 * The Knuth-Morris-Pratt (KMP) String Matching Algorithm
 * (Substring Search)
 * Time Complexity is: O(X + Y) where
 *   X is length of text (text.length) &
 *   Y is length of pattern (pattern.length)
 */
public class KMP {

    private final String TEXT; // النص الذي يتم البحث فيه
    private int[] prefixArrayOfPattern; // This table contains numbers indicate the prefix in array of char
    private boolean isLetterSensitive; // The letters are sensitive ? (default: false => not sensitive)

    public KMP(String text) {
        this.TEXT = text;
    }

    public KMP(String text, boolean isLetterSensitive) {
        TEXT = text;
        this.isLetterSensitive = isLetterSensitive;
    }

    public void setLetterSensitive(boolean isLetterSensitive) {
        this.isLetterSensitive = isLetterSensitive;
    }

    private int[] computePrefixArray(char[] pattern) { // Calculate table of prefix
        int[] result = new int[pattern.length];
        result[0] = 0;
        for (int i = 1; i < result.length; i++)
            result[i] = -1;
        int i = 1;
        int j = 0;

        while (i < pattern.length) {
            if (pattern[i] == pattern[j]) {
                result[i] = j + 1;
                i++;
                j++;
            } else {
                if (j == 0) {
                    result[i++] = 0;
                } else {
                    j = result[j - 1];
                }
            }
        }

        return result;
    }

    public boolean isFound(String pattern) { // Search if the pattern exist inside the text
        char[] patternSearch;
        char[] textSearch;

        if (isLetterSensitive) {
            patternSearch = pattern.toCharArray();
            textSearch = TEXT.toCharArray();
        } else {
            patternSearch = pattern.toLowerCase().toCharArray();
            textSearch = TEXT.toLowerCase().toCharArray();
        }

        this.prefixArrayOfPattern = computePrefixArray(patternSearch);

        int indexOfText = 0; // Index of Text table
        int indexOfPattern = 0; // Index of Pattern table

        while (indexOfText < textSearch.length && indexOfPattern < patternSearch.length) {
            if (textSearch[indexOfText] == patternSearch[indexOfPattern]) {
                indexOfText++;
                indexOfPattern++;
            } else {
                if (indexOfPattern == 0) {
                    indexOfText++;
                } else {
                    indexOfPattern = prefixArrayOfPattern[indexOfPattern - 1];
                }
            }
        }

        return indexOfPattern == patternSearch.length;

    }

    public List<Integer> searchAndGetIndex(String pattern) { // Search and get List of Start Position
        char[] patternSearch;
        char[] textSearch;

        if (isLetterSensitive) {
            patternSearch = pattern.toCharArray();
            textSearch = TEXT.toCharArray();
        } else {
            patternSearch = pattern.toLowerCase().toCharArray();
            textSearch = TEXT.toLowerCase().toCharArray();
        }

        List<Integer> foundIndex = new LinkedList<>();

        int indexOfText = 0; // Index of Text table
        int indexOfPattern = 0; // Index of Pattern table

        while (indexOfText < textSearch.length) {
            if (textSearch[indexOfText] == patternSearch[indexOfPattern]) {
                indexOfText++;
                indexOfPattern++;
            } else {
                if (indexOfPattern == 0) {
                    indexOfText++;
                } else {
                    indexOfPattern = prefixArrayOfPattern[indexOfPattern - 1];
                }
            }

            if (indexOfPattern == patternSearch.length) { // if found add the index in the list of foundIndex
                foundIndex.add(indexOfText - indexOfPattern);
                indexOfPattern = 0;
            }
        }

        return foundIndex;
    }

    /* Additional Methods */

    public void printArray(int[] array) { // print array of integer
        for (int item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public void printArray(char[] array) { // print array of char
        for (char item : array)
            System.out.print(item + " ");
        System.out.println();
    }

}
