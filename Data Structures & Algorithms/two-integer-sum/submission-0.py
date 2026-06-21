class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict={}
        ret=[]
        for i in range(len(nums)):
            if target-nums[i] in dict:
                ind=dict[target-nums[i]]
                if i<ind:
                    ret.append(i)
                    ret.append(ind)
                else:
                    ret.append(ind)
                    ret.append(i)
                return ret
            dict[nums[i]]=i