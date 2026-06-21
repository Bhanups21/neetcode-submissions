class Solution {

    public String encode(List<String> strs) {
        StringBuilder s=new StringBuilder();
        for(String str:strs){
            s.append(str);
            s.append((char)129);
        }
        s.append((char)130);
        return s.toString();
    }

    public List<String> decode(String str) {
        StringBuilder temp=new StringBuilder();
        List<String> l=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==(char)129){
                l.add(temp.toString());
                temp=new StringBuilder();
            }
            else if(str.charAt(i)==(char)130){
                break;
            }
            else{
                temp.append(str.charAt(i));
            }
        }
        return l;
    }
}
