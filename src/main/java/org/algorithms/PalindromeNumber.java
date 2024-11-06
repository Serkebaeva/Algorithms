package org.algorithms;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(x);
        for(int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        String strBackward = sb.toString();
        return str.equals(strBackward);
    }

    public static void main(String[] args) {
        PalindromeNumber str = new PalindromeNumber();
        System.out.println(str.isPalindrome(123));
        System.out.println(str.isPalindrome(121));
        System.out.println(str.isPalindrome(-121));
    }
}
