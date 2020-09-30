package InfreanCodingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Intervals {
	int start;
	int end;

	Intervals(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergeIntervals {
	/*
	 * Given a collection of intervals, merge all overlapping intervals;
	 */
	public static void main(String[] args) {
		Intervals in2 = new Intervals(1, 3);
		Intervals in1 = new Intervals(2, 6);
		Intervals in3 = new Intervals(8, 10);
		Intervals in4 = new Intervals(15, 18);

		List<Intervals> intervalList = new ArrayList<>();
		intervalList.add(in1);
		intervalList.add(in2);
		intervalList.add(in3);
		intervalList.add(in4);

		MergeIntervals a = new MergeIntervals();
		List<Intervals> list = a.merge(intervalList);
		a.print(list);

	}

	public List<Intervals> merge(List<Intervals> list) {
		if (list.isEmpty())
			return list;
		
		List<Intervals> result = new ArrayList<>();
		Collections.sort(list, (a, b) -> a.start - b.start);
		Intervals before = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			Intervals second = list.get(i);
			if (before.end >= second.start) {
				before.end = Math.max(before.end, second.end);
				// before.end=second.end; <- 이렇게 하면 [1,4] [2,3]인 경우 merge 결과가 1,3 된다. 
 			} else {
				result.add(before);
				before = second;
			}
		}
		if (!result.contains(before)) {
			result.add(before);
		}
		return result;
	}
	void print(List<Intervals> list) {
		for (int i = 0; i < list.size(); i++) {
			Intervals in = list.get(i);
			System.out.println(in.start + " " + in.end);
		}
	}

}
