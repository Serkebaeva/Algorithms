package findTheDifference;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static char findTheDifference(String s, String t) {
        List<Character> arrayList = new ArrayList<>();

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        for(char ch: arrT) {
            arrayList.add(ch);
        }

        for(char ch: arrS) {
            arrayList.remove(Character.valueOf(ch));
        }

        return arrayList.get(0);
    }

  public static  void main(String[] args){
    System.out.println(findTheDifference("abcd", "abcde"));
  }
}
