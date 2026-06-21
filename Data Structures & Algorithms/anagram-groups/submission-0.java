class Solution {
    public static String makeArrayString(String s){
        int[] chars=new int[26];
        for(char c:s.toCharArray()){
            chars[c-'a']++;
        }
        return Arrays.toString(chars);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            String key=makeArrayString(s);
            if(map.containsKey(key)){
                List<String> l=map.get(key);
                l.add(s);
                map.put(key,l);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(s);
                map.put(key,l);
            }
            System.out.println(map.toString());
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> e:map.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
