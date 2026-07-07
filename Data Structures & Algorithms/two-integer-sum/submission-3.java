class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int j=map.get(target-nums[i]);
                // System.out.println(i+" "+j);
                if(i!=j){
                    res[0]=Math.min(i,j);
                    res[1]=Math.max(i,j);
                    return res;
                }
            }
            map.put(nums[i],i);
        }
        // System.out.println(map.toString());
        return res;
    }
}
