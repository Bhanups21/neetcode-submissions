class Solution {
    public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			// System.out.println(s.charAt(i) + " " + (int) (s.charAt(i)));
			if (!(s.charAt(i) > 64 && s.charAt(i) < 91) && !(s.charAt(i) > 96 && s.charAt(i) < 123)
					&& !(s.charAt(i) > 47 && s.charAt(i) < 58)) {
				i++;
				continue;
			}
			if (!(s.charAt(j) > 64 && s.charAt(j) < 91) && !(s.charAt(j) > 96 && s.charAt(j) < 123)
					&& !(s.charAt(j) > 47 && s.charAt(j) < 58)) {
				j--;
				continue;
			}
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
