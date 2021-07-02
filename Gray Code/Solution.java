import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	public List<Integer> grayCode(int n) {
		List<String> list = Arrays.asList("");

		while (n-- > 0) {
			list = convert(list);
		}

		return list.stream().map(x -> Integer.parseInt(x, 2)).collect(Collectors.toList());
	}

	public List<String> convert(List<String> list) {
		List<String> converted = list.stream().map(x -> "0" + x).collect(Collectors.toList());
		Collections.reverse(list);
		converted.addAll(list.stream().map(x -> "1" + x).collect(Collectors.toList()));
		return converted;
	}
}
