package org.zegai.algorithms.search.kmp;

import java.util.List;

public class KMPDemo {

    public static void main(String[] args) {
        // The text you are searching for
        String text = "hello My houar name Hellohoua is houarHouari ZEGAI houari.";
        // Text to search for
        String pattern = "Hello";

        KMP kmp = new KMP(text);
        kmp.setLetterSensitive(true);

        boolean isFound = kmp.isFound(pattern);
        System.out.println(isFound ? "Found !" : "Not Found !");

        List<Integer> foundIndex = kmp.searchAndGetIndex(pattern);
        if (!foundIndex.isEmpty()) {
            for (Integer index : foundIndex)
                System.out.println("At index: " + index);
        }
    }
}
