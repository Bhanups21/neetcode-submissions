class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=nums[0];
        int length=nums.length;
        int zeroCount=0;
        for(int i=1;i<length;i++){
            if(nums[i]==0){
                zeroCount++;
                continue;
            }
            product*=nums[i];
        }
        int[] res=new int[length];
        for(int i=0;i<length;i++){
            if(nums[i]==0 && zeroCount==1){
                res[i]=product;
            }
            else if(nums[i]==0 && zeroCount>1){
                res[i]=0;
            }
            else if(nums[i]!=0 && zeroCount>0){
                res[i]=0;
            }
            else{
                res[i]=product/nums[i];
            }
        }
        return res;
    }
}  
