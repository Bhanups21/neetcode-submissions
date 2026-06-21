class Solution {
    public int trap(int[] height) {
        int[] prefix=new int[height.length];
        int currentMax=height[0];
        prefix[0]=height[0];
        for(int i=1;i<height.length;i++){
            currentMax=Math.max(currentMax,height[i]);
            prefix[i]=currentMax;
        }
        // System.out.println(Arrays.toString(prefix));
        currentMax=height[height.length-1];
        for(int j=height.length-1;j>-1;j--){
            currentMax=Math.max(currentMax,height[j]);
            prefix[j]=Math.min(prefix[j],currentMax);
        }
        // System.out.println(Arrays.toString(suffix));
        int result=0;
        for(int i=0;i<height.length;i++){
            result+=(prefix[i]-height[i]);
        }
        return result;
    }
}
