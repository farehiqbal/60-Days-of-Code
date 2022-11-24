import java.util.Arrays;

class SingleNumber {
    // public int singleNumber(int[] nums) {
        
        
    //     for(int i =0; i < nums.length; i++){
    //         for(int j = i + 1; i<nums.length; i++){
                
    //             if (nums[i] == nums[j])
    //                 continue;
    //             else
                
    //                 return j;
    //         }
            
    //     }
    //     return 0;
    // }

    public int singleNumber(int[] nums) {

        int result = 0;
        for(int i : nums) {
            result = result ^ i;
        }
        return result;
    }

    public int singleNumber2(int[] nums){

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i+=2) {
            
            if (nums[i]!= nums[i+1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {

        SingleNumber singlenum = new SingleNumber();
        
        System.out.println(singlenum.singleNumber(new int[] {2,2,1}));

        System.out.println(singlenum.singleNumber(new int[] {4,1,2,1,2}));


        System.out.println(singlenum.singleNumber2(new int[] {2,2,1}));

        System.out.println(singlenum.singleNumber2(new int[] {4,1,2,1,2}));
    }
}