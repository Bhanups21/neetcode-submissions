class Solution {
    public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int length = 0;
		while (end < s.length()) {
			if (map.containsKey(s.charAt(end))) {
				int temp = start;
				start = map.get(s.charAt(end)) + 1;
				for (int i = temp; i < start; i++) {
					map.remove(s.charAt(i));
				}
			}
			map.put(s.charAt(end), end);
			end++;
			length = Math.max(end - start, length);
		}
		return length;
	}
}
