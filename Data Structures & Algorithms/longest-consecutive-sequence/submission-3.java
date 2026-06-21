class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        // System.out.println(set.toString());
        int maxCount=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int count=0;
                while(set.contains(i+count)){
                    count++;
                    // System.out.println(i+" "+count+" "+maxCount);
                }
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
}
