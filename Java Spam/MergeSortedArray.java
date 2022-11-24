import java.util.Arrays;

class MergeSortedArray {

    // worst approach lmao
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 1; i <= n; i++){
            
            int temp = nums1[i+m-1];
            nums1[m+i-1] = nums2[i-1];
            nums2[i-1] = temp;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
            
        
    }


    public static void main(String[] args) {
        
        merge(new int[] {1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}