class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        left[0]=0;
        right[n-1]=0;
        int[] res=new int[n];
        for(int i=1;i<n-1;i++){
            res[i]=left[i]*right[i];
        }
        res[0]=right[0];
        res[n-1]=left[n-1];
        return res;
    }
}  
