
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        int[] arr = new int[2];

        for(int i=0; i >nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                
                if (nums[i] + nums[j] == target)
                    arr[0] = i;
                    arr[1] = j;
                    
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return arr;

        
    }


    public static void main(String[] args) {
        
        twoSum(new int[] {2,7,11,15}, 9);
    }
}