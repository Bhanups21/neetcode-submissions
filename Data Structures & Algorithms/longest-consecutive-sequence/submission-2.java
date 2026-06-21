class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,null);
            }
            if(map.containsKey(i-1)){
                map.put(i-1,i);
            }
            if(map.containsKey(i+1)){
                map.put(i,i+1);
            }
        }
        System.out.println(map);
        int maxCount=0;
        int count=1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()!=null && e.getKey()+1==e.getValue()){
                count++;
                System.out.println(e.getKey()+" "+e.getValue()+" "+count+" "+maxCount);
            }
            else{
                if(count>=maxCount){
                    maxCount=count;
                    count=1;
                }
                System.out.println("max - "+e.getKey()+" "+e.getValue()+" "+count+" "+maxCount);
            }
        }
        return maxCount;
    }
}
