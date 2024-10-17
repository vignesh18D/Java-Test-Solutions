package problem;

import java.util.HashMap;
import java.util.Map;

public class problem4 {

	public static void main(String[] args) {
		int[] Array = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
		Map<Integer, Integer> multipleCounts = new HashMap<>();
        
		for (int i = 1; i <= 9; i++) {
            multipleCounts.put(i, 0);
        }
		
		for (int number : Array) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    multipleCounts.put(i, multipleCounts.get(i) + 1);
                }
            }
        }
		 System.out.println(multipleCounts);
	}

}
