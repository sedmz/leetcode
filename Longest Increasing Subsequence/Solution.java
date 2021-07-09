class Solution {
	public int lengthOfLIS(int[] nums) {
		int max = 0;

		int[] subsequences = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					subsequences[j] = Math.max(subsequences[i] + 1, subsequences[j]);
					max = Math.max(max, subsequences[j]);
				}
			}
		}

		return max + 1;
	}
}
