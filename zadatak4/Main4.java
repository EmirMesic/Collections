package zadatak4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			numbers.add(i);
		}
		long timerStart = 0;
		long timerStop = 0;
		long time1 = 0;
		long time2 = 0;
		long time3 = 0;
		long time4 = 0;
		long time5 = 0;
		long time6 = 0;
		
		// counting time using iterator
		timerStart = System.currentTimeMillis();
		for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		timerStop = System.currentTimeMillis();
		time2 = timerStop - timerStart;

		// counting time using for each
		timerStart = System.currentTimeMillis();
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		timerStop = System.currentTimeMillis();
		time1 = timerStop - timerStart;
		
		timerStart = System.currentTimeMillis();
		for (int i = 0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		timerStop = System.currentTimeMillis();
		time5 = timerStop - timerStart;
		
		//LINKED LIST
		List<Integer> numbersLinked = new LinkedList<Integer>();
		numbersLinked.addAll(numbers);
		// counting time using iterator
		timerStart = System.currentTimeMillis();
		for (Iterator<Integer> iterator = numbersLinked.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		timerStop = System.currentTimeMillis();
		time3 = timerStop - timerStart;

		// counting time using for each
		timerStart = System.currentTimeMillis();
		for (Integer integer : numbersLinked) {
			System.out.println(integer);
		}
		timerStop = System.currentTimeMillis();
		time4 = timerStop - timerStart;
		
		// counting time using get index
		timerStart = System.currentTimeMillis();
		for(int i = 0; i<numbersLinked.size(); i++)
			System.out.println(numbersLinked.get(i));
		
		timerStop = System.currentTimeMillis();
		time6 = timerStop - timerStart;
			
		
		System.out.println(time2 + "ms - iterator");
		System.out.println(time1 + "ms - for each");
		System.out.println(time5 + "ms - index");
		
		System.out.println(time3 + "ms - iterator");
		System.out.println(time4 + "ms - for each");
		System.out.println(time6 + "ms - index");
	}
}
