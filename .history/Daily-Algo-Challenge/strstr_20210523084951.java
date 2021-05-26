/**
 * Implement strstr().
Solution:
O(nm) runtime, O(1) space – Brute force:
Difficulty: Easy, Frequency: High
   Returns the index of the first occurrence of needle in haystack, or –1
 if needle is not part of haystack.
There are known efficient algorithms such as Rabin-Karp algorithm, KMP algorithm, or the Boyer-Moore algorithm. Since these algorithms are usually studied in an advanced algorithms class, it is sufficient to solve it using the most direct method in an interview – The brute force method.
The brute force method is straightforward to implement. We scan the needle with the haystack from its first position and start matching all subsequent letters one by one. If one of the letters does not match, we start over again with the next position in the haystack.
Assume that n = length of haystack and m = length of needle, then the runtime complexity is O(nm).
 */

 /**
  * Scenarios to consider.
    i.  needle or haystack is empty. If needle is empty, always return 0. If haystack is empty, then there will always be no match(return -1) unless the needle is also empty which 0 is returned.
    ii. needle's length is greater than haystack's length. Should always return -1.
    iii. needle is located at the end of haystack. For example, "aaaba" and "ba". Catch possible off-by-one errors.
    iv. needle occur multiple times in haystack. Eg. "mississippi" and "issi". It should return index 2 as the first match of "issi".
  */

public class strstr {
    // Driver Code
    public static void main(String[]  args){
        strCheck
    }

    public int strstrCheck(String hayStack, String needle){
        if(hayStack==null || needle == null) {
            return -1;
        }
        if(hayStack.equals(needle)) {
            return 0;
        }

        // advance approach
        for(int i = 0; i < hayStack.length();){
            return hayStack.indexOf(needle.substring(0, needle.length()));
        }
        return -1;
    }

    // Interview Approarch with DSA
    public int strCheck(String haystack, String word){
        if(haystack == null || word == null){
            return -1;
        }
        if(word.isEmpty()){
            return 0;
        }
    
        

        return -1;
    }

}
