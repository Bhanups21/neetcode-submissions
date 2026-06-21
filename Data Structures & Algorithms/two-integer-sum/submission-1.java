class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int x=map.get(target-nums[i]);
                if(x>i){
                    return new int[]{i,x};
                }
                else{
                    return new int[]{x,i};
                }
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
