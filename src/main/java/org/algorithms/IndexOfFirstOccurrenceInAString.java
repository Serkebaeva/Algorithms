package org.algorithms;

public class IndexOfFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

    public static void main(String[] args) {
        IndexOfFirstOccurrenceInAString test = new IndexOfFirstOccurrenceInAString();
        String string1 = "sadbutsad";
        String string2 = "sad";
        System.out.println(test.strStr(string1, string2));
    }
}
