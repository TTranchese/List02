import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> divisorOf52 = new ArrayList<>();
		for (int i = 1; i <=52; i++){
			if (52%i==0) divisorOf52.add(i);
		}
		List<Integer> randomNumbers = new ArrayList<>();
		randomNumbers.add(1);
		randomNumbers.add(60);
		randomNumbers.add(13);
		randomNumbers.add(12);
		randomNumbers.addAll(divisorOf52);
		System.out.println(randomNumbers+" "+randomNumbers.size());
		randomNumbers=randomNumbers
				.stream()
				.sorted()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(randomNumbers);
		randomNumbers.sort(Collections.reverseOrder());
		System.out.println(randomNumbers);

	}
}