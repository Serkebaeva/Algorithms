package lengthOfLastWord;
class Solution {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastWord = String.valueOf(arr[arr.length - 1]);

        return lastWord.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}