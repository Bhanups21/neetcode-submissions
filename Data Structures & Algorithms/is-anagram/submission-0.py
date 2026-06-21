class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lookup={}
        for i in s:
            if i in lookup:
                lookup[i]+=1
            else:
                lookup[i]=1
        for i in t:
            if i in lookup:
                lookup[i]-=1
            else:
                return False
        for i in lookup:
            if lookup[i]!=0:
                return False
        return True