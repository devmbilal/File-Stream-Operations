//	Write a Java program to reverse a string using loops and recursion.
package reversestring;

public class ReverseString {

    public static String reverseStringR(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseStringR(str.substring(1)) + str.charAt(0);
    }

    public static String reverseStringL(String str) {
        char[] strArray = str.toCharArray();
        int left = 0;
        int right = strArray.length - 1;
        while (right > left) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            right--;
            left++;
        }
        return new String(strArray);
    }
}
