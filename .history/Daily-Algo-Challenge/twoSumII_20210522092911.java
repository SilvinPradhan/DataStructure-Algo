// Two Sum II – Input array is sorted
// O(n Log n) runtime, O(1) space - Binary Search

class twoSumII {
    public int[] twoSum(int[] numbers, int target) {
        // Assume input is already sorted
        int i, j;
        for(i=0; i<numbers.length; i++){
            j = binarySearch(numbers, target-numbers[i], i+1);
            if(j!=-1){
                return new int[] {i+1, j+1};
            }
        }
        throw new IllegalArgumentException('No ')
    }

    private int binarySearch(int[] A, int key, int start) {
        int L = start, R = A.length - 1;
        while(L<R){
            int M = (L+R)/2;
            if(A[M] < key) {
                L=M+1;
            }else{
                R=M;
            }
        }
        return (L==R && A[L] == key) ? L:-1;
    }

/**  O(n) runtime, O(1) space - Two Pointers */
// Let's assume we have two indices pointing to the ith and jth elements, Ai and Aj respectively.
/** The sum of Ai and Aj could only fall into one of these three possibilities:
i. Ai + Aj > target. Increasing i isn’t going to help us, as it makes the sum even
bigger. Therefore we should decrement j.
ii. Ai + Aj < target. Decreasing j isn’t going to help us, as it makes the sum even
smaller. Therefore we should increment i.
iii. Ai + Aj == target. We have found the answer.  */

    public int[] twoSum2(int[] nums, int value){
        // Assume input is already sorted
        int i = 0, j=nums.length -1;
        while(i<j) {
            int sum = nums[i] + nums[j];
            if(sum< value) {
                i++;
            } else if(sum > value) {
                j--;
            } else {
                return new int[] { i+1, j+1};
            }
        }
        throw new IllegalArgumentException("No two sum solution found.");
    }

}



