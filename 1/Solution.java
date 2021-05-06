import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] rcd = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        //System.out.println(nums[3]);
        int st = 0;
        int ed = nums.length - 1;
        while(true){
            //System.out.println(st + "," + ed);
            int sum = nums[ed] + nums[st];
            //System.out.println(sum);
            if(sum == target){
                int start = 0, end = 0;
                for(int j = 0; j < rcd.length; j++){
                    if(rcd[j] == nums[st]){
                        rcd[j] = -999999999;
                        start = j;
                        break;
                    }
                }
                for(int j = 0; j < rcd.length; j++){
                    if(rcd[j] == nums[ed]){
                        rcd[j] = -999999999;
                        end = j;
                    }
                }
                return new int[]{start,end};
            } else if (sum < target) {
                st ++;
            } else if (sum > target){
                ed --;
            }
            if(st == ed){break;}
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,4};
        System.out.println(twoSum(nums,6)[0]);
    }
}