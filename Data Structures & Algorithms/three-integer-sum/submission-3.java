class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
		Set<List<Integer>> l = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			int target = -nums[i];
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				if (nums[j] + nums[k] == target) {
					l.add(List.of(nums[i], nums[j], nums[k]));
					j++;
                    k--;
				} else if (nums[j] + nums[k] > target) {
					k--;
				} else {
					j++;
				}
			}
		}
		return l.stream().toList();
    }
}
