import java.util.*;

class MyCalendar {
	List<int[]> availableRanges;

	public MyCalendar() {
		availableRanges = new ArrayList<>();
		availableRanges.add(new int[] { 0, 1_000_000_000 });
	}

	public boolean book(int start, int end) {
		for (int i = 0; i < availableRanges.size(); i++) {
			int[] range = availableRanges.get(i);
			if (end <= range[1] && start >= range[0]) {
				confirm(i, range, start, end);
				return true;
			} else if (range[0] >= end) {
				break;
			}
		}
		return false;
	}

	public void confirm(int i, int[] range, int start, int end) {
		availableRanges.remove(i);
		availableRanges.add(i, new int[] { end, range[1] });
		availableRanges.add(i, new int[] { range[0], start });
	}
}
