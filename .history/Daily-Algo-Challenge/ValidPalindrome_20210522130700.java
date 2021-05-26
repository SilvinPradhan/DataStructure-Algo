// O(n) runtime, O(1) space:

public class ValidPalindrome {
    public static void main(String[] args){
        // Basic Method
    }

    // Given a string, determine if it is a palindrome, considering only alpha-
    // numeric characters and ignoring cases
    /** Example Questions Candidate Might Ask:
    Q: What about an empty string? Is it a valid palindrome?
    A: For the purpose of this problem, we define empty string as valid palindrome.
 */
    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            };
            while(i<j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }         
        }
        return true;
    }
}
