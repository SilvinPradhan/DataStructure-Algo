// Two Sum II – Input array is sorted
// O(n Log n) runtime, O(1) space - Binary Search

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Assume input is already sorted
        int i, j;
        for(i=0; i<numbers.length; i++){
            j = binarySearch(numbers, target-numbers[i], i+1);
            if(j!=-1){
                return new int[] {i+1, j+1}
            }
        }
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
}

/**  O(n) runtime, O(1) space - Two Pointers */