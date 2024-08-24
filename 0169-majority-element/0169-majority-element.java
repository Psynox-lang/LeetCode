class Solution {
    public int majorityElement(int[] nums) {
        int counter=0;
        int n=nums.length;
        int size=n/2;
        int temp=0;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(nums[i]==nums[j] && i==j){
                    counter+=1;
                    if(counter>size){
                        temp=nums[i];

                    }
                }
            }
        }
        return temp;
        
    }
}