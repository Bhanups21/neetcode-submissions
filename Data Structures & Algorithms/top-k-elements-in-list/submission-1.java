class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        List<Integer>[] frequency=new ArrayList[nums.length+1];
        for(int i=0;i<nums.length+1;i++){
            frequency[i]=new ArrayList<Integer>();
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            frequency[e.getValue()].add(e.getKey());
        }
        int[] res=new int[k];
        int index=0;
        for(int i=frequency.length-1;i>0;i--){
            if(index==k){
                        break;
                    }
            if(!frequency[i].isEmpty()){
                for(int j:frequency[i]){
                    res[index]=j;
                    index++;
                    System.out.println(index);
                    if(index==k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}
