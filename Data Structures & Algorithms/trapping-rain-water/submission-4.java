class Solution {
    public int trap(int[] height) {
        if(height.length==1 || height.length==2){
            return 0;
        }
        int left=height[0];
        int right=height[height.length-1];
        int i=1;
        int j=height.length-2;
        int result=0;
        while(i<=j){
            if(left<=right){
                if(height[i]>left){
                    left=height[i];
                }
                else{
                    result+=left-height[i];
                }
                i++;
            }
            else{
                if(height[j]>right){
                    right=height[j];
                }
                else{
                    result+=right-height[j];
                }
                j--;
            }
        }
        return result;
    }
}
