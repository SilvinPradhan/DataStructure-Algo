// Given an array of integers, find two numbers such that they add up to a specific target number.
// The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
// You may assume that each input would have exactly one solution.

/* Array of Integers be
    arr = [1,5 2, 4,6,8,9]
    index1 < index2
    # Solution: Hash Table(Hash Map) that maps the value to its index
 */
public class twoSum {
    public static main(String[] args)
 {

 }}


 public int[] twoSum(int[] numbers, int target){
     Map<Integer,Integer> map = new HashMap<>();
     for(int i = 0;i <numbers.length; i++) {
         int x = numbers[i];
         if(map.containsKey(target - x)) {
             return new int[] {
                 map.get(target-x) + 1, i+1
             }; 
         }
         map.put(x, i) 
     }
     throw new IllegalArgumentException("No Two Solution")
 }