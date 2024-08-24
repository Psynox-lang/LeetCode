class Solution {
    public boolean containsDuplicate(int[] nums) {
        int counter=0;
        int n=nums.length;
        //boolean isduplicate=false;
        Arrays.sort(nums);
        
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
        
        
    }
}