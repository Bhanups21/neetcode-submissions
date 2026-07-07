class Solution {
    public String getF(String s){
        int[] res=new int[26];
        for(char c: s.toCharArray()){
            res[c-'a']++;
        }
        return Arrays.toString(res);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s: strs){
            String res=getF(s);
            if(map.containsKey(res)){
                map.get(res).add(s);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(res,list);
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(List c: map.values()){
            result.add(c);
        }
        //System.out.println(map.toString());
        return result;
    }
}
