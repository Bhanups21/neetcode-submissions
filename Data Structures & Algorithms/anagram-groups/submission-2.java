class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map= new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            if(map.containsKey(key)){
                List<String> list=map.get(key);
                list.add(str);
                map.put(key,list);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(Map.Entry<String,List<String>> e: map.entrySet()){
            result.add(e.getValue());
        }
        return result;
    }
}
