
Leetcode Code Question 344
public class reverseStrings {
    // Function that reverse a string. The ;input string is given as an array of characters char[].
    // DO not allocate extra space for another array, yo umust do this by modifying the input array in-place with O(1) extra memory.
    public void reverseString(char[] str) {
        int a_pointer = 0;
        int b_pointer = str.length - 1;
        while(a_pointer<=b_pointer){
            char temp = str[a_pointer];
            str[a_pointer] = str[b_pointer];
            str[b_pointer] = temp;

        
        }
    }
}
