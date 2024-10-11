package Tasks_revisiting.stringIsOneRow;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {

    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (isOneRow(word, row1) || isOneRow(word, row2) || isOneRow(word, row3)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }

    private boolean isOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(test.findWords(words)));
    }
}