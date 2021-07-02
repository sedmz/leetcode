import java.util.*;

public class Solution {
	public List<Integer> grayCode(int n) {
		List<String> binaryList = Arrays.asList("");

		while (n-- > 0) {
			binaryList = convert(binaryList);
		}

		List<Integer> answer = new ArrayList<>();
		for (String binary : binaryList) {
			answer.add(Integer.parseInt(binary, 2));
		}
		return answer;
	}

	public List<String> convert(List<String> binaryList) {
		Collections.reverse(binaryList);

		List<String> converted = new ArrayList<>();
		for (String binary : binaryList) {
			converted.add(0, "0" + binary);
			converted.add("1" + binary);
		}
		return converted;
	}
}
