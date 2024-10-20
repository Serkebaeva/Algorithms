package reverseString;

import java.util.Arrays;

class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;

        char i;
        while(start < end) {
            i = (char)s[start];
            s[start] = s[end];
            s[end] = i;

            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        ReverseString test = new ReverseString();
        char[] arr = {'h','e','l','l','o'};
        test.reverseString(arr);
        System.out.println(Arrays.toString(arr));


    }
}