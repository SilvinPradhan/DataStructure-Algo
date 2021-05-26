import java.util.Arrays;
import java.util.Collections;

public class reverseString {
    /** 
     * Given an input string s, reverse the string word by word.
For example, given s = "the sky is blue", return "blue is sky the".

     */
    // O(n) runtime, O(n) space:
    // Approach:
    // First pass to split the string by spaces into array of words, then second pass to extract the words in reversed order.
    /** While iterating the string in reverse order, we keep track of a word’s begin and end position. When we are at the beginning of a word, we append it. */

    public String reverseWords(String str){
        char[] characters = str.toCharArray();
        int i =0;
        int j = str.length()-1;
        while(i<j) {
            // reverse the characters stored in the ith index and jth index, i.e SWAP
            char temp = characters[i];
            characters[i] = characters[]
        }
        return str;
        
    }
    public String reverseSentence(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
